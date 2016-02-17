package com.tantch.dmlive;

import java.awt.Event;
import java.util.Map.Entry;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.Image;
import com.badlogic.gdx.scenes.scene2d.ui.Label;
import com.badlogic.gdx.scenes.scene2d.ui.ScrollPane;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;
import com.badlogic.gdx.scenes.scene2d.ui.Table;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.tantch.dmlive.logic.Adventure;
import com.tantch.dmlive.logic.DCharacter;

public class AdvScreen implements Screen {

	private Adventure adventure;
	private Stage stage;
	private Skin skin;
	private SpriteBatch batch;
	private ShapeRenderer renderer;
	private Table scrollTable,container;

	public AdvScreen() {
		adventure = new Adventure();

		renderer = new ShapeRenderer();
		skin = new Skin(Gdx.files.internal("data/uiskin.json"));
		skin.getAtlas().getTextures().iterator().next().setFilter(TextureFilter.Nearest, TextureFilter.Nearest);
		skin.getFont("default-font").getData().markupEnabled = true;
		float scale = 1;
		skin.getFont("default-font").getData().setScale(scale);
		stage = new Stage(new ScreenViewport());
		Gdx.input.setInputProcessor(stage);
		
		
		
		
		Label title = new Label("DMLive 5ed", skin);
		title.setPosition(stage.getWidth() / 2 - title.getWidth() / 2, stage.getHeight() - title.getHeight());
		stage.addActor(title);
		Label advTitle = new Label(adventure.getTitle(), skin);
		advTitle.setPosition(stage.getWidth() / 2 - title.getWidth() / 2,
				stage.getHeight() - title.getHeight() - advTitle.getHeight());
		stage.addActor(advTitle);
		

	    scrollTable = new Table(skin);
	    scrollTable.top();
	    for(Entry<String,DCharacter > entry : adventure.getPcs().entrySet()) {
	    	Label tmp = new Label(entry.getValue().getName(),skin);
	    	tmp.addListener(new ClickListener(){
				@Override
				public void clicked(InputEvent event, float x, float y) {
					System.out.println("click  " + ((Label) event.getListenerActor()).toString());
					
				}
			});
			scrollTable.add(tmp);
			scrollTable.add(entry.getValue().getRName());
			scrollTable.row();

			scrollTable.add("Level: " + entry.getValue().getLevel());
			scrollTable.add(entry.getValue().getHpString());
			scrollTable.row();
			
			scrollTable.add("AC: " + entry.getValue().getAC());
			scrollTable.add("Initiative: " + entry.getValue().getInit());
			scrollTable.row();
			
			
			scrollTable.add("PP: " + entry.getValue().getPP());
			scrollTable.add("Stealth: " + entry.getValue().getStealth());
			scrollTable.row();
			
			scrollTable.add("---------------------------------------------------").colspan(2);
			scrollTable.row();
		}
		/*scrollTable.addListener(new ClickListener(){
			@Override
			public void clicked(InputEvent event, float x, float y) {
				((Table) event.getListenerActor()).hit(x, y, true);
				
			}
		});*/
		
		final ScrollPane scrollPane = new ScrollPane(scrollTable);
	    scrollPane.setBounds(0, 0, stage.getHeight() / 10 * 4,(stage.getHeight() / 10)*9);
	    scrollPane.setScrollingDisabled(true, false);
		stage.addActor(scrollPane);
		//scrollPane.debug();
		//scrollTable.debug();


		Image pcs;
		pcs = new Image(new Texture(Gdx.files.internal("imgs/Attack.png")));
		pcs.setSize(stage.getHeight() / 10, stage.getHeight() / 10);
		pcs.setPosition(0, stage.getHeight() - pcs.getHeight());
		pcs.addListener(new ClickListener() {
			@Override
			public void clicked(InputEvent event, float x, float y) {
				System.out.println("click");
				if (scrollPane.isVisible()) {
					scrollPane.setVisible(false);
				} else {
					scrollPane.setVisible(true);
				}
			}
		});
		stage.addActor(pcs);
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub

	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0.2f, 0.2f, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		stage.act(Gdx.graphics.getDeltaTime());
		stage.draw();

	}

	@Override
	public void resize(int width, int height) {
		// stage.getViewport().update(width, height, true);
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		stage.dispose();
	}
	
	
	
	public void openCharacterWindow(String name){
		
	}

}
