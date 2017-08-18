package radoslaw.slowinski.ares.listeners;

import com.badlogic.gdx.Input;
import com.badlogic.gdx.InputProcessor;
import radoslaw.slowinski.ares.entites.Player;
import radoslaw.slowinski.ares.utils.Constant;

/**
 * Created by ares on 12.08.17.
 */
public class InputListener implements InputProcessor {
    Player player;

    public InputListener(Player player) {
        this.player = player;
    }


    @Override
    public boolean keyDown(int keycode) {
        if (keycode == Input.Keys.A) {
            player.changeMaskBits();
        } else if (keycode == Input.Keys.D) {
            player.jump();
        }
        return true;
    }

    @Override
    public boolean keyUp(int keycode) {
        return false;
    }

    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        if (screenX <= Constant.GAME_WIDTH / 2) {
            player.changeMaskBits();
        } else {
            player.jump();
        }
        return true;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
        return false;
    }

    @Override
    public boolean mouseMoved(int screenX, int screenY) {
        return false;
    }

    @Override
    public boolean scrolled(int amount) {
        return false;
    }
}