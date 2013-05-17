package org.pachnanda.designpattern;
/**
 *  I can process all plans
 * @author macbookpro
 *
 */
public class CongessionEvent {

	public void process(DefaultPlanService sp) {
		System.out.println("CongessionEvent processed by a DefaultPlanService");
	}

	public void process(AdvancedPlanService sp) {
		System.out.println("CongessionEvent processed by a AdvancedPlanService");
	}

	public void process(InformationPlanService sp) {
		System.out
				.println("CongessionEvent processed by a InformationPlanService");
	}

}
