package pl.lcc.tuna;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;
import pl.lcc.tuna.tuner.SoundDrawer;
import pl.lcc.tuna.tuner.SoundProcessor;
import pl.lcc.tuna.tuner.SoundSaver;

public class Tuna extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
    private SoundProcessor soudProcessor;
    private SoundDrawer soundDrawer;
    private SoundSaver soundSaver;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("badlogic.jpg");
                soudProcessor = new SoundProcessor();
                soundDrawer = new SoundDrawer(500,500);
                soundSaver = new SoundSaver("first.txt");
	}

	@Override
	public void render () {
		ScreenUtils.clear(1, 0, 0, 1);
                var sound = soudProcessor.getSound();
                var tex = new Texture(soundDrawer.drawFromSound(sound));
                soundSaver.save(sound);
		batch.begin();
		batch.draw(img, 0, 0);
                batch.draw(tex, 100, 100);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
                soudProcessor.dispose();
                soundDrawer.dispose();
	}
}
