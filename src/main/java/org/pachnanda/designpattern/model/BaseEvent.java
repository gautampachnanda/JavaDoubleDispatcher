package org.pachnanda.designpattern.model;

import org.pachnanda.designpattern.service.*;

public abstract class BaseEvent {
	public abstract void process(DefaultPlanService sp);

	public abstract void process(AdvancedPlanService sp);

	public abstract void process(InformationPlanService sp);

}
