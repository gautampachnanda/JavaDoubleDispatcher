package org.pachnanda.designpattern.service;

import org.pachnanda.designpattern.model.CongessionEvent;

public class AdvancedPlanService extends DefaultPlanService {

	public void process(CongessionEvent planService) {
		planService.process(this);
	}

}
