package cn.qiuxiang.react.amap3d;

import android.view.View;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

class AMapMarkerManager extends SimpleViewManager<View> {
    @Override
    public String getName() {
        return "AMapMarker";
    }

    @Override
    protected View createViewInstance(ThemedReactContext reactContext) {
        return new AMapMarker(reactContext);
    }

    @ReactProp(name = "title")
    public void setTitle(AMapMarker marker, String title) {
        marker.setTitle(title);
    }

    @ReactProp(name = "description")
    public void setSnippet(AMapMarker marker, String description) {
        marker.setSnippet(description);
    }

    @ReactProp(name = "coordinate")
    public void setCoordinate(AMapMarker view, ReadableMap coordinate) {
        view.setCoordinate(coordinate);
    }

    @ReactProp(name = "flat")
    public void setFlat(AMapMarker marker, boolean flat) {
        marker.setFlat(flat);
    }

    @ReactProp(name = "opacity")
    public void setOpacity(AMapMarker marker, float opacity) {
        marker.setOpacity(opacity);
    }

    @ReactProp(name = "draggable")
    public void setDraggable(AMapMarker marker, boolean draggable) {
        marker.setDraggable(draggable);
    }

    @ReactProp(name = "image")
    public void setImage(AMapMarker marker, String image) {
        marker.setImage(image);
    }
}
