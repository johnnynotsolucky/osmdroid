/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.osmdroid.samplefragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.osmdroid.tileprovider.constants.OpenStreetMapTileProviderConstants;
import org.osmdroid.views.MapView;

import java.io.File;

/**
 *
 * @author alex
 */
public class SampleAlternateCacheDir extends BaseSampleFragment{
  @Override
  public String getSampleTitle() {
    return "Alt Cache Dir";
  }

  @Override
  public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    View v = inflater.inflate(org.osmdroid.R.layout.mapview, null);
    OpenStreetMapTileProviderConstants.setCachePath(new File("/sdcard/osmdroid2/").getAbsolutePath());
    mMapView = (MapView) v.findViewById(org.osmdroid.R.id.mapview);
          
		return v;
	}
     
}
