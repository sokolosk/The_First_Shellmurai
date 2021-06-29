package org.academiadecodigo.shellmurais.gameobjects;

import org.academiadecodigo.shellmurais.gameobjects.enemies.Enemy;
import org.academiadecodigo.shellmurais.gameobjects.platform.Platform;
import org.academiadecodigo.shellmurais.gameobjects.player.Player;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

public abstract class GameObject {

    protected Picture rectangle;
    protected boolean isMoving = true;

    protected abstract void init() /*throws Exception*/;

/*    public boolean collisionRIGHT(Player player, GameObject gameObj) {
        if (player.getFinalX() == gameObj.getStartX()) {
            if ((player.getFinalY() <= gameObj.getFinalY() && player.getFinalY() >= gameObj.getStartY())
                    || (player.getStartY()) <= gameObj.getFinalY() && (player.getStartY() >= gameObj.getStartY())) {
                return true;
            }
        }
        return false;
    }
    public boolean collisionLEFT(Player player, GameObject gameObj) {
        if (player.getStartX() == gameObj.getFinalX()) {
            if ((player.getFinalY() <= gameObj.getFinalY() && player.getFinalY() >= gameObj.getStartY())
                    || (player.getStartY()) <= gameObj.getFinalY() && (player.getStartY() >= gameObj.getStartY())) {
                return true;
            }
        }
        return false;
    }
    public boolean collisionUP(Player player, GameObject gameObj) {
        if (player.getStartY() == gameObj.getFinalY()) {
            if ( (player.getStartX() >= gameObj.getStartX() && player.getStartX() <= (gameObj.getFinalX())
                    || ((player.getFinalX()) >= gameObj.getStartX() && (player.getFinalX()) <= (gameObj.getFinalX()))) ) {
                return true;
            }

        }
        return false;
    }
    public boolean collisionDOWN(Player player, GameObject gameObj) {
        if (player.getFinalY() == gameObj.getStartY()) {
            if ( (player.getStartX() >= gameObj.getStartX() && player.getStartX() <= (gameObj.getFinalX())
                    || (player.getFinalX() >= gameObj.getStartX() && player.getFinalX() <= gameObj.getFinalX())) ) {
                return true;
            }

        }
        return false;
    }*/

    public boolean isMoving() {
        return isMoving;
    }

    public void stopMoving() {
        isMoving = false;
    }

    public boolean collision(GameObject gameObj) {
        boolean result = false;

        if ((this.getFinalX() > gameObj.getStartX() && this.getStartX() < gameObj.getFinalX()) &&
               ( this.getFinalY() >= gameObj.getStartY() && this.getStartY() <= gameObj.getFinalY())
        ) {
            //System.out.println("Collided");
            result = true;
        }


        return result;
    }

    public int getStartX() { return rectangle.getX(); }
    public int getFinalX() { return rectangle.getX() + rectangle.getWidth(); }
    public int getStartY() { return rectangle.getY(); }
    public int getFinalY() { return rectangle.getY() + rectangle.getHeight(); }
}
