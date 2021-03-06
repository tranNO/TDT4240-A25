package com.example.airhockey;

import org.andengine.engine.camera.Camera;
import org.andengine.engine.options.EngineOptions;
import org.andengine.engine.options.ScreenOrientation;
import org.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy;
import org.andengine.entity.scene.Scene;
import org.andengine.entity.scene.background.Background;
import org.andengine.ui.activity.SimpleBaseGameActivity;

import android.view.Menu;

public class MainActivity extends SimpleBaseGameActivity {


	static final int CAMERA_WIDTH = 800;

    static final int CAMERA_HEIGHT = 480;

    private Scene scene;
    public Camera mCamera;
    
    private static MainActivity instance;
    @Override
    public EngineOptions onCreateEngineOptions() {
    	instance = this;
    	mCamera = new Camera(0, 0, CAMERA_WIDTH, CAMERA_HEIGHT);
    	return new EngineOptions(true, ScreenOrientation.LANDSCAPE_SENSOR,
    			new RatioResolutionPolicy(CAMERA_WIDTH, CAMERA_HEIGHT), mCamera);

    }

    @Override
    protected void onCreateResources() {
    	// TODO Auto-generated method stub
    }

    @Override
    protected Scene onCreateScene() {
    	scene = new TitleScreen();
    	return scene;
    }

    public static MainActivity getInstance(){
    	return instance;
    }
    
    public void setScene(Scene scene){
    	this.scene = scene;
    	mEngine.setScene(this.scene);
    }

}
