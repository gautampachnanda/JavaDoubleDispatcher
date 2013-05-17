package org.pachnanda.designpattern.service;

import org.pachnanda.designpattern.model.CongessionEvent;

public class DefaultPlanService {
	public void process(CongessionEvent planService) {
		planService.process(this);
	}
}
