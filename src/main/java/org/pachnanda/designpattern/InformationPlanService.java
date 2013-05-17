package org.pachnanda.designpattern;
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
