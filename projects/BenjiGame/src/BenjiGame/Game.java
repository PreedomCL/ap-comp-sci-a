package BenjiGame;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;

public class Game implements Runnable{

    private Display display;
    private width


    public Game(String title, int width,int height) {
        this.width = width;
        this.height = height;
        this.title = title;

        keyManager = new KeyManager();
        mouseManager = new MouseManager();


    }

    private void init() {
        display = new Display(title, width, height);
        display.getFrame().addKeyListener(keyManager);
        display.getFrame().addMouseListener(mouseManager);
        display.getFrame().addMouseMotionListener(mouseManager);
        display.getCanvas().addMouseListener(mouseManager);
        display.getCanvas().addMouseMotionListener(mouseManager);
        try {
            Assets.init();
        } catch (Exception e) {
            e.printStackTrace();
        }

        handler = new Handler(this);

        State.setState(menuState);



    }

    private void tick() {
        keyManager.tick();
        if(State.getState() != null)
            State.getState().tick();
        if(handler.getKeyManager().keyJustPressed(KeyEvent.VK_H))
            debugMode = !debugMode;

    }
    private void render(double delta) {
        bs = display.getCanvas().getBufferStrategy();
        if(bs == null) {
            display.getCanvas().createBufferStrategy(3);
            return;
        }
        //start code
        g = bs.getDrawGraphics();
        g.clearRect(0, 0, 10000, 10000);
        //Draw

        if(State.getState() != null)
            State.getState().render(g);
        if(debugMode) {
            Text.drawString(g,"FPS: " + Integer.toString((int) (1000000000/delta)), 31, 31, false, Color.LIGHT_GRAY, Assets.font14);
        }
        //End Code

        bs.show();
        g.dispose();


    }
    public void run() {

        init();

        fps = 60;
        double timePerTick = 1000000000 / fps;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        while(running) {
            now = System.nanoTime();
            delta += (now-lastTime) ;
            lastTime = now;
            if(delta/ timePerTick >= 1) {
                tick();
                render(delta);
                delta = 0;
            }
        }

        stop();
    }

    public synchronized void start() {
        if(running)
            return;

        running = true;
        thread = new Thread(this);
        thread.start();

    }

    public synchronized void stop() {
        if(!running)
            return;

        running = false;

        try {
            thread.join();
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
