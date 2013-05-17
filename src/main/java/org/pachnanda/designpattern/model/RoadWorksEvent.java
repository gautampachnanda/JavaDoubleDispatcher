package org.pachnanda.designpattern.model;

import org.pachnanda.designpattern.service.AdvancedPlanService;
import org.pachnanda.designpattern.service.DefaultPlanService;
import org.pachnanda.designpattern.service.InformationPlanService;

/**
 *  I can only process Default Plans
 * @author macbookpro
 *
 */
public class RoadWorksEvent extends CongessionEvent {
	public void process(DefaultPlanService sp) {
		System.out.println("RoadWorksEvent processed a DefaultPlanService");
	}

	public void process(AdvancedPlanService sp) {
		System.out.println("RoadWorksEvent ignored a AdvancedPlanService");
	}
	
	public void process(InformationPlanService sp) {
		System.out.println("RoadWorksEvent ignored a InformationPlanService");
	}
}
