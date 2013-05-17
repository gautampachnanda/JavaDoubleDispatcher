package org.pachnanda.designpattern;

import org.pachnanda.designpattern.model.*;
import org.pachnanda.designpattern.service.*;

public class DoubleDispatchJava {

	
	public static void main(String args[]) {
        CongessionEvent ce = new CongessionEvent();
        RoadWorksEvent rwe = new RoadWorksEvent();
        DefaultPlanService ps1 = new DefaultPlanService();
        DefaultPlanService ps2 = new AdvancedPlanService();
        DefaultPlanService ps3 = new InformationPlanService();
    
        ps1.process(ce);
        ps1.process (rwe);

        ps2.process(ce);
        ps2.process(rwe);
        
        ps3.process(ce);
        ps3.process(rwe);
    }
}
