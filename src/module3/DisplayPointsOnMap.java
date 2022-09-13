package module3;

import java.util.ArrayList;
import java.util.List;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.data.PointFeature;
import de.fhpotsdam.unfolding.geo.Location;
import de.fhpotsdam.unfolding.marker.Marker;
import de.fhpotsdam.unfolding.marker.SimplePointMarker;
import de.fhpotsdam.unfolding.providers.Microsoft;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class DisplayPointsOnMap extends PApplet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	UnfoldingMap map;
	public void setup() {
		size(800,600,OPENGL);
		background(255);
		map = new UnfoldingMap(this, new Microsoft.HybridProvider());
		MapUtils.createDefaultEventDispatcher(this, map);
		Location home = new Location(11.087942,77.355536);
		Location chennai = new Location(13.081596,80.278350);
		Location africa = new Location(1.896628,23.819150);
		Location australia = new Location(-25.865811,126.107395);
		Location america = new Location(-12.239813,-44.238190);
		
		List<PointFeature> features = new ArrayList<PointFeature>();
		PointFeature eq0 = new PointFeature(home);
		PointFeature eq1 = new PointFeature(chennai);
		PointFeature eq2 = new PointFeature(africa);
		PointFeature eq3 = new PointFeature(australia);
		PointFeature eq4 = new PointFeature(america);
		features.add(eq0);
		features.add(eq1);
		features.add(eq2);
		features.add(eq3);
		features.add(eq4);
		List<Marker> markers = new ArrayList<Marker>();
		for(PointFeature p : features) {
			markers.add(new SimplePointMarker(p.getLocation()));
		}
		for(Marker m: markers)
			m.setColor(color(255,255,0));
		
		map.addMarkers(markers);
		
//		SimplePointMarker m = new SimplePointMarker(eq.getLocation(),eq.getProperties());
//		m.setColor(color(255,255,0));
		
//		map.zoomAndPanToFit(m);
		
	}
	public void draw() {
		map.draw();
	}
}
