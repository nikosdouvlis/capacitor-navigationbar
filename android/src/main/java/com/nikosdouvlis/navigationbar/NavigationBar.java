package com.nikosdouvlis.navigationbar;

import android.app.Activity;
import android.graphics.Color;
import android.util.Log;
import android.view.Window;

import com.getcapacitor.NativePlugin;
import com.getcapacitor.Plugin;
import com.getcapacitor.PluginCall;
import com.getcapacitor.PluginMethod;

@NativePlugin()
public class NavigationBar extends Plugin {
    private String TAG = "capacitor-navigationbar";

    @PluginMethod()
    public void setBackgroundColor(PluginCall call) {
        String color = call.getString("color");

        if(color == null || color.equals("") || !color.contains("#")){
            call.error("Color cannot be empty or null. It should be a hex value, eg: #d1009d");
        }
        Log.d(TAG, "setBackgroundColor: called with color " +  color);

        // this can be used instead to set a color
        // in colors.xml: getActivity().getResources().getColor(R.color.colorPrimary)
        try{
            final int parsedColor = Color.parseColor(color);
            final Window window = ((Activity) getContext()).getWindow();

            // only update views on ui thread
            getActivity().runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    window.setNavigationBarColor(parsedColor);
                }
            });
        } catch (Exception e){
            Log.d(TAG, "setBackgroundColor: " + e.toString());
            call.error(e.toString());
        }

        call.success();
    }
}
