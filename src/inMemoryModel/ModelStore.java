package inMemoryModel;

import modelElements.Camera;
import modelElements.Flash;
import modelElements.PoligonalModel;
import modelElements.Scene;
import stuf.Angle3D;
import stuf.Point3D;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger {
    public List<PoligonalModel> models;
    public List<Scene> scenes;
    public List<Flash> flashes;
    public List<Camera> cameras;
    private List<IModelChangedObserver> changesObservers;

    public ModelStore(List<IModelChangedObserver> changesObservers) {
        this.changesObservers = changesObservers;
        this.models = new ArrayList<>();
        this.scenes = new ArrayList<>();
        this.flashes = new ArrayList<>();
        this.cameras = new ArrayList<>();

        models.add(new PoligonalModel(null));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(0, models, flashes, cameras));

    }

    public Scene getScene(int ID) {
        for (Scene scene : scenes) {
            if (scene.id == ID) {
                return scene;
            }
        }
        return null;
    }

    @Override
    public void notifyChange(IModelChanger sender) {

    }
}
