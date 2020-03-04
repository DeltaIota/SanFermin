package com.rodriguezgarcia.antoniojesus;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.GlyphLayout;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.FitViewport;
import com.rodriguezgarcia.antoniojesus.utils.Constants;

public class LevelScreen implements Screen {

    SanFerminGame game;
    FitViewport viewport;
    ShapeRenderer renderer;
    SpriteBatch batch;
    BitmapFont font;

    public LevelScreen(SanFerminGame game){
        this.game = game;
    }

    @Override
    public void show(){
        renderer = new ShapeRenderer();
        batch = new SpriteBatch();

        viewport = new FitViewport(Constants.WORLD_SIZE, Constants.WORLD_SIZE);

        font = new BitmapFont();

        font.getData().setScale(1.5f);
        font.getRegion().getTexture().setFilter(Texture.TextureFilter.Linear, Texture.TextureFilter.Linear);
    }

    @Override
    public void render(float delta) {
        /*viewport.apply();
        Gdx.gl.glClearColor(Constants.BACKGROUND_COLOR.r, Constants.BACKGROUND_COLOR.g, Constants.BACKGROUND_COLOR.b, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

        renderer.setProjectionMatrix(viewport.getCamera().combined);
        renderer.begin(ShapeRenderer.ShapeType.Filled);

        renderer.setColor(Constants.EASY_COLOR);
        renderer.circle(Constants.EASY_CENTER.x, Constants.EASY_CENTER.y, Constants.DIFFICULTY_BUBBLE_RADIUS);

        renderer.setColor(Constants.MEDIUM_COLOR);
        renderer.circle(Constants.MEDIUM_CENTER.x, Constants.MEDIUM_CENTER.y, Constants.DIFFICULTY_BUBBLE_RADIUS);

        renderer.setColor(Constants.HARD_COLOR);
        renderer.circle(Constants.HARD_CENTER.x, Constants.HARD_CENTER.y, Constants.DIFFICULTY_BUBBLE_RADIUS);

        renderer.end();

        batch.setProjectionMatrix(viewport.getCamera().combined);
        batch.begin();

        final GlyphLayout easyLayout = new GlyphLayout(font, Constants.EASY_LABEL);
        font.draw(batch, Constants.EASY_LABEL, Constants.EASY_CENTER.x, Constants.EASY_CENTER.y + easyLayout.height / 2, 0, Align.center, false);

        final GlyphLayout mediumLayout = new GlyphLayout(font, Constants.MEDIUM_LABEL);
        font.draw(batch, Constants.MEDIUM_LABEL, Constants.MEDIUM_CENTER.x, Constants.MEDIUM_CENTER.y + mediumLayout.height / 2, 0, Align.center, false);

        final GlyphLayout hardLayout = new GlyphLayout(font, Constants.HARD_LABEL);
        font.draw(batch, Constants.HARD_LABEL, Constants.HARD_CENTER.x, Constants.HARD_CENTER.y + hardLayout.height / 2, 0, Align.center, false);

        batch.end();*/
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width,height,true);
    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {
        batch.dispose();
        font.dispose();
        renderer.dispose();
    }

    @Override
    public void dispose() {

    }
}