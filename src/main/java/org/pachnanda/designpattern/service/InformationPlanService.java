package org.pachnanda.designpattern.service;

import org.pachnanda.designpattern.model.CongessionEvent;

/**
 * 
 * @author macbookpro
 *
 */
public class InformationPlanService extends DefaultPlanService {

	public void process(CongessionEvent planService) {
		planService.process(this);
	}
}
