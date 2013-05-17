package org.pachnanda.designpattern;

public class AdvancedPlanService extends DefaultPlanService {

	public void process(CongessionEvent planService) {
		planService.process(this);
	}

}
