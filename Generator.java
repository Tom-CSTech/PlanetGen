import java.security.SecureRandom;

public class Generator {

	//Variable declaration
	String status;
	String sentience;
	String biodiversity;
	String [] purposes = new String[6];
	String purpose;
	String nativeSetStyle;
	String colonySetStyle;
	String nativeSetLoc;
	String colonySetLoc;
	String nativeWorldPop;
	String colonyWorldPop;
	String atmosphere;
	String atmosphereInt;
	String precipitation;
	String air;
	String airPtc;
	String airOpac;
	String outsideCdtnPlus;
	String gas;
	String gasPtc;
	String gasOpac;
	String underneath;
	String biomeNum;
	String [] surfaces = new String[7];
	String surface;
	String oceanic;
	String liquidPtc;
	String liquidOpac;
	String [] plants = new String[6];
	String plant;
	String animalLife;
	String water;
	
	//Counting/Tracking variables for calculations
	int res;
	int plr = 0;
	int count = 0;
	int sct = 0;
	
	SecureRandom random = new SecureRandom();
	
	
	//No-arg Constructor
	public Generator() {
		this.status = getStatus();
		this.biodiversity = getBiodiversity();
		this.purpose = getPurpose();
		this.atmosphere = getAtmosphere();
		this.atmosphereInt = getAtmosphereIntensity();
		this.precipitation = getPrecipitation();
		this.surface = getSurface();
		this.colonySetStyle = getColonySetStyle();
		this.colonySetLoc = getColonySetLoc();
		this.colonyWorldPop = getColonyWorldPop();
		this.air = getAir();
		this.airPtc = getAirPtc();
		this.airOpac = getAirOpac();
		this.outsideCdtnPlus = getOutsideCdtnPlus();
		this.gas = getGas();
		this.gasPtc = getGasPtc();
		this.gasOpac = getGasOpac();
		this.underneath = getUnderneath();
		this.oceanic = getOceanic();
		this.liquidPtc = getLiquidPtc();
		this.liquidOpac = getLiquidOpac();
		this.plant = getPlants();
		this.animalLife = getAnimalLife();
		this.sentience = getSentience();
		this.nativeWorldPop = getNativeWorldPop();
		this.nativeSetStyle = getNativeSetStyle();
		this.nativeSetLoc = getNativeSetLoc();
		this.water = getDependency();
	}
	
	//Fully Parameterized Constructor (could probably use one but meanwhile it's not in use)
	/*public Generator(String status, String biodiversity, String purpose) {
		this.status = status;
		this.biodiversity = biodiversity;
		this.purpose = purpose;
	}*/
	
	//Constructor with Status preset via Switch in Driver
	/* Because constructors are distinct by their parameters, I had to 
	 * make "status" an Int and then alter the value it inserts, so the other
	 * preset could use String parameter input. Hassles saved if I make the fully
	 * parameterized constructor*/
	public Generator(int status) {
		if (status == 2) {
			this.status = "Discovered";
		}
		else if (status == 3) {
			this.status = "Settled";
		}
		else if (status == 4) {
			this.status = "Undiscovered";
		}
		this.biodiversity = getBiodiversity();
		this.purpose = getPurpose();
		this.atmosphere = getAtmosphere();
		this.atmosphereInt = getAtmosphereIntensity();
		this.precipitation = getPrecipitation();
		this.surface = getSurface();
		this.colonySetStyle = getColonySetStyle();
		this.colonySetLoc = getColonySetLoc();
		this.colonyWorldPop = getColonyWorldPop();
		this.air = getAir();
		this.airPtc = getAirPtc();
		this.airOpac = getAirOpac();
		this.outsideCdtnPlus = getOutsideCdtnPlus();
		this.gas = getGas();
		this.gasPtc = getGasPtc();
		this.gasOpac = getGasOpac();
		this.underneath = getUnderneath();
		this.plant = getPlants();
		this.animalLife = getAnimalLife();
		this.sentience = getSentience();
		this.nativeWorldPop = getNativeWorldPop();
		this.nativeSetStyle = getNativeSetStyle();
		this.nativeSetLoc = getNativeSetLoc();
		this.water = getDependency();
	}
	
	//Constructor with biodiversity param
	public Generator(String biodiversity) {
		this.status = getStatus();
		this.biodiversity = getBiodiversity();
		this.purpose = getPurpose();
		this.atmosphere = getAtmosphere();
		this.atmosphereInt = getAtmosphereIntensity();
		this.precipitation = getPrecipitation();
		this.surface = getSurface();
		this.colonySetStyle = getColonySetStyle();
		this.colonySetLoc = getColonySetLoc();
		this.colonyWorldPop = getColonyWorldPop();
		this.air = getAir();
		this.airPtc = getAirPtc();
		this.airOpac = getAirOpac();
		this.outsideCdtnPlus = getOutsideCdtnPlus();
		this.gas = getGas();
		this.gasPtc = getGasPtc();
		this.gasOpac = getGasOpac();
		this.underneath = getUnderneath();
		this.plant = getPlants();
		this.animalLife = getAnimalLife();
		this.sentience = getSentience();
		this.nativeWorldPop = getNativeWorldPop();
		this.nativeSetStyle = getNativeSetStyle();
		this.nativeSetLoc = getNativeSetLoc();
		this.water = getDependency();
	}
	
	//Constructor with both status and biodiversity params chosen through Switch statement
	public Generator(int status, String biodiversity) {
		if (status == 2) {
			this.status = "Discovered";
		}
		else if (status == 3) {
			this.status = "Settled";
		}
		else if (status == 4) {
			this.status = "Undiscovered";
		}
		this.biodiversity = biodiversity;
		this.purpose = getPurpose();
		this.atmosphere = getAtmosphere();
		this.atmosphereInt = getAtmosphereIntensity();
		this.precipitation = getPrecipitation();
		this.surface = getSurface();
		this.colonySetStyle = getColonySetStyle();
		this.colonySetLoc = getColonySetLoc();
		this.colonyWorldPop = getColonyWorldPop();
		this.air = getAir();
		this.airPtc = getAirPtc();
		this.airOpac = getAirOpac();
		this.outsideCdtnPlus = getOutsideCdtnPlus();
		this.gas = getGas();
		this.gasPtc = getGasPtc();
		this.gasOpac = getGasOpac();
		this.underneath = getUnderneath();
		this.plant = getPlants();
		this.animalLife = getAnimalLife();
		this.sentience = getSentience();
		this.nativeWorldPop = getNativeWorldPop();
		this.nativeSetStyle = getNativeSetStyle();
		this.nativeSetLoc = getNativeSetLoc();
		this.water = getDependency();
	}
	
	//--Getters and Setters
	
	public String getStatus() {
		res = 1 + random.nextInt(8);
		if (res >= 1 && res < 5) {
			status = "Discovered";
		}
		else if (res >= 5 && res < 8) {
			status = "Settled";
		}
		else if (res == 8) {
			status = "Undiscovered";
		}
		return status;
	}
	
	public String getBiodiversity() {
		res = 1 + random.nextInt(20);
		if (res >= 1 && res < 8) {
			biodiversity = "0";
		}
		else if (res == 8) {
			biodiversity = "<20";
		}
		else if (res == 9) {
			biodiversity = "20-500";
		}
		else if (res == 10) {
			biodiversity = "500-2000";
		}
		else if (res == 11) {
			biodiversity = "2000-10,000";
		}
		else if (res >= 12 && res < 21) {
			biodiversity = "10,000-50,000";
		}
		return biodiversity;
	}
	
	/*private void setBiod(String biodiversity) {
		this.biodiversity = biodiversity;
	}*/

	
	public String getPurpose() {
		
		if (status != "Settled") {
			return "None";
		}
		
		else {
		//For Loop that assigns values starting at 0, filling one index at a time
		for (int i = 0 ; i < 6 ; i++) {
			res = 1 + random.nextInt(10);
			if (res == 1) {
				purposes[i] = "Habitation";
				//Only bothers checking if it already has at least one index assigned
				if (i > 0) {
					//Counter for duplicate search
					for (int j = 0 ; j < i ; j++) {
						if (purposes[j] != null && purposes[j].equals("Habitation")) {
							//Nulls the current Purpose if it found pre-existing duplicate
							purposes[i] = null;
							break;
						}
					}
				}
			}
			else if (res == 2) {
				purposes[i] = "Metals";
				if (i > 0) {
					for (int j = 0 ; j < i ; j++) {
						if (purposes[j] != null && purposes[j].equals("Metals")) {
							purposes[i] = null;
							break;
						}
					}
				}
			}
			else if (res == 3) {
				purposes[i] = "Non-Metallic Minerals";
				if (i > 0) {
					for (int j = 0 ; j < i ; j++) {
						if (purposes[j] != null && purposes[j].equals("Other Minerals")) {
							purposes[i] = null;
							break;
						}
					}
				}
			}
			else if (res == 4) {
				purposes[i] = "Energy";
				if (i > 0) {
					for (int j = 0 ; j < i ; j++) {
						if (purposes[j] != null && purposes[j].equals("Energy")) {
							purposes[i] = null;
							break;
						}
					}
				}
			}
			else if (res == 5) {
				purposes[i] = "Plant";
				if (i > 0) {
					for (int j = 0 ; j < i ; j++) {
						if (purposes[j] != null && purposes[j].equals("Plant")) {
							purposes[i] = null;
							break;
						}
					}
				}
			}
			else if (res == 6) {
				purposes[i] = "Health/Safety";
				if (i > 0) {
					for (int j = 0 ; j < i ; j++) {
						if (purposes[j] != null && purposes[j].equals("Health/Safety")) {
							purposes[i] = null;
							break;
						}
					}
				}
			}
			else if (res >= 7 && res <= 10) {
				if (i == 0) {
					purposes[i] = "Useless/Inefficient";
				}
				//If no purpose, doesn't bother checking for additional purposes
				break;
			}
			//Flips coin to see if it should do the For loop for an additional purpose
			res = 1 + random.nextInt(2);
			if (res == 1) {
				break;
			}
		}
		//Chooses appropriate output to return value for one or more indexes assigned
		//If 2 indexes are assigned, purposes[1] should NOT be null, so it should go to the next return option
		if (purposes[1] == null) {
			return purposes[0];
		}
		else if (purposes[2] == null) {
			return purposes[0] +" and " +purposes[1];
		}
		else if (purposes[3] == null) {
			return purposes[0] +" and " +purposes[1] +" and " +purposes[2];
		}
		else if (purposes[4] == null) {
			return purposes[0] +" and " +purposes[1] +" and " +purposes[2] +" and " +purposes[3];
		}
		else if (purposes[5] == null) {
			return purposes[0] +" and " +purposes[1] +" and " +purposes[2] +" and " +purposes[3] +" and " +purposes[4];
		}
		else {
			return purposes[0] +" and " +purposes[1] +" and " +purposes[2] +" and " +purposes[3] +" and " +purposes[4] +" and " +purposes[5];
		}
		}
	}
	
	public String getColonySetStyle() {
		
		if (status != "Settled") {
			return "N/A";
		}
		
		else {
		
		res = 1 + random.nextInt(6);
		if (res == 1) {
			colonySetStyle = "Scattered Network";
		}
		else if (res == 2) {
			colonySetStyle = "Large Single Contiguous Structures";
		}
		else if (res == 3) {
			colonySetStyle = "Metropolitan";
		}
		else if (res == 4) {
			colonySetStyle = "Metro-Dense";
		}
		else if (res == 5) {
			colonySetStyle = "Towns";
		}
		else if (res == 6) {
			colonySetStyle = "Villages";
		}
		return colonySetStyle;
		}
	}
	
	public String getColonySetLoc() {
		
		if (status != "Settled") {
			return "N/A";
		}
		
		else {
		
		res = 1 + random.nextInt(6);
		if (res == 1 || res == 7) {
			colonySetLoc = "Surface";
		}
		else if (res == 2 || res == 8) {
			colonySetLoc = "Caves Underground";
		}
		else if (res == 3) {
			colonySetLoc = "Undersurface (Not Buried)";
		}
		else if (res == 4) {
			colonySetLoc = "Mountain/Ravine Cliffs";
		}
		else if (res == 5) {
			if (precipitation.equals("Moderate") || precipitation.equals("Regular/Heavy") || surfaces[0].equals("Continental (Aquatic Oceans)") || surfaces[0].equals("Continental (Non-Water Oceans)") || surfaces[0].equals("Aquatic Submerged") || surfaces[0].equals("Submerged (Non-Water)")) {
				colonySetLoc = "Floating (Oceanic)";
			}
			else {
				colonySetLoc = "Hovering (Surface Proximity)";
			}
		}
		else if (res == 6) {
			colonySetLoc = "Floating (Sky)";
		}
		return colonySetLoc;
		}
	}
	
	public String getColonyWorldPop() {
		
		if (status != "Settled") {
			return "N/A";
		}
		
		else {
		
		res = 1 + random.nextInt(10);
		if (res == 1) {
			colonyWorldPop = "<100";
		}
		else if (res == 2) {
			colonyWorldPop = "100-K";
		}
		if (res == 3) {
			colonyWorldPop = "K-10K";
		}
		else if (res == 4) {
			colonyWorldPop = "10K-100K";
		}
		else if (res == 5) {
			colonyWorldPop = "100K-1M";
		}
		else if (res == 6) {
			colonyWorldPop = "1M-10M";
		}
		else if (res == 7) {
			colonyWorldPop = "10M-100M";
		}
		else if (res == 8) {
			colonyWorldPop = "100M-1B";
		}
		else if (res == 9) {
			colonyWorldPop = "1B-10B";
		}
		else if (res == 10) {
			colonyWorldPop = "10B-100B";
		}
		return colonyWorldPop;
		}
	}
	
	public String getAtmosphere() {
		res = 1 + random.nextInt(20);
		if (res >= 1 && res < 12) {
			atmosphere = "Void";
		}
		else if (res == 12) {
			atmosphere = "Dry (Still)";
		}
		else if (res == 13) {
			atmosphere = "Dry (Moderate)";
		}
		else if (res == 14) {
			atmosphere = "Dry (Turbulent)";
		}
		else if (res == 15) {
			atmosphere = "Balanced (Still)";
		}
		else if (res == 16) {
			atmosphere = "Balanced (Moderate)";
		}
		else if (res == 17) {
			atmosphere = "Balanced (Turbulent)";
		}
		else if (res == 18) {
			atmosphere = "Humid (Still)";
		}
		else if (res == 19) {
			atmosphere = "Humid (Moderate)";
		}
		else if (res == 20) {
			atmosphere = "Humid (Turbulent)";
		}
		return atmosphere;
	}
	
	public String getAtmosphereIntensity() {
		
		if (atmosphere == "Void") {
			return "N/A";
		}
		
		else {
		
		res = 1 + random.nextInt(8);
		if (res == 1) {
			atmosphereInt = "Extreme";
		}
		else if (res == 2) {
			atmosphereInt = "Intense";
		}
		else if (res == 3) {
			atmosphereInt = "Strong";
		}
		else if (res == 4) {
			atmosphereInt = "Significant";
		}
		else if (res == 5) {
			atmosphereInt = "Notable";
		}
		else if (res == 6) {
			atmosphereInt = "Mild";
		}
		else if (res == 7) {
			atmosphereInt = "Subtle";
		}
		else if (res == 8) {
			atmosphereInt = "Negligible";
		}
		return atmosphereInt;
		}
	}
	
	public String getAir() {
		
		if (atmosphere == "Void") {
			return "N/A";
		}
		
		else {
		
		res = 1 + random.nextInt(6);
		if (res == 1) {
			air = "Harmless";
		}
		else if (res == 2) {
			air = "Nauseating";
		}
		else if (res == 3) {
			air = "Suffocating";
		}
		else if (res == 4) {
			air = "Toxic";
		}
		else if (res == 5) {
			air = "Acidic";
		}
		else if (res == 6) {
			air = "Burning";
		}
		return air;
		}
	}
	
	public String getAirPtc() {
		
		if (atmosphere == "Void") {
			return "N/A";
		}
		
		else {
		
		res = 1 + random.nextInt(8);
		if (res == 1) {
			airPtc = "Extreme";
		}
		else if (res == 2) {
			airPtc = "Intense";
		}
		else if (res == 3) {
			airPtc = "Strong";
		}
		else if (res == 4) {
			airPtc = "Significant";
		}
		else if (res == 5) {
			airPtc = "Notable";
		}
		else if (res == 6) {
			airPtc = "Mild";
		}
		else if (res == 7) {
			airPtc = "Subtle";
		}
		else if (res == 8) {
			airPtc = "Negligible";
		}
		return airPtc;
		}
	}
	
	public String getAirOpac() {
		
		if (atmosphere == "Void") {
			return "N/A";
		}
		
		else {
		
		res = 1 + random.nextInt(8);
		if (res == 1) {
			airOpac = "Impenetrable";
		}
		else if (res == 2) {
			airOpac = "Thick";
		}
		else if (res == 3) {
			airOpac = "Difficult";
		}
		else if (res >= 4 && res < 6) {
			airOpac = "Moderate";
		}
		else if (res >= 6 && res < 8) {
			airOpac = "Light";
		}
		else if (res == 8) {
			airOpac = "Invisible";
		}
		return airOpac;
		}
	}
	
	public String getPrecipitation() {
		if (atmosphere.contentEquals("Void")) {
			return "N/A";
		}
		else {
			if (atmosphere.charAt(0) == 'D') {
				res = 1 + random.nextInt(2);
				if (res == 1) {
					return "Occasional/Light";
				}
				else {
					return "Negligible/None";
				}
			}
			else if (atmosphere.charAt(0) == 'B') {
				res = 1 + random.nextInt(2);
				if (res == 1) {
					return "Moderate";
				}
				else {
					return "Occasional/Light";
				}
			}
			else if (atmosphere.charAt(0) == 'H') {
				res = 1 + random.nextInt(8);
				if (res == 1) {
					return "Regular/Heavy";
				}
				else {
					return "Moderate";
				}
			}
			else {
				return "N/A";
			}
		}
	}
	
	public String getOutsideCdtnPlus() {
		if (atmosphere.contentEquals("Void")) {
			res = 1 + random.nextInt(6);
			if (res == 1) {
				outsideCdtnPlus = "Steep Temperature Swings";
			}
			else if (res == 2) {
				outsideCdtnPlus = "Steep Temperature Swings";
			}
			else if (res == 3) {
				outsideCdtnPlus = "Excruciating Cold";
			}
			else if (res == 4) {
				outsideCdtnPlus = "Sweltering Ground Heat";
			}
			else if (res == 5) {
				outsideCdtnPlus = "Radioactive";
			}
			else if (res == 6) {
				outsideCdtnPlus = "Steep Temperature Swings";
			}
		}
		else {
			res = 1 + random.nextInt(6);
			if (res == 1) {
				outsideCdtnPlus = "None";
			}
			else if (res == 2) {
				outsideCdtnPlus = "Blistering Solar Heat";
			}
			else if (res == 3) {
				outsideCdtnPlus = "Excruciating Cold";
			}
			else if (res == 4) {
				outsideCdtnPlus = "Sweltering Ground Heat";
			}
			else if (res == 5) {
				outsideCdtnPlus = "Radioactive";
			}
			else if (res == 6) {
				outsideCdtnPlus = "Highly Regular Gaseous Venting";
			}
		}
		return outsideCdtnPlus;
	}
	
	public String getGas() {
		res = 1 + random.nextInt(6);
		if (res == 1) {
			gas = "Harmless";
		}
		else if (res == 2) {
			gas = "Nauseating";
		}
		else if (res == 3) {
			gas = "Suffocating";
		}
		else if (res == 4) {
			gas = "Toxic";
		}
		else if (res == 5) {
			gas = "Acidic";
		}
		else if (res == 6) {
			gas = "Burning";
		}
		return gas;
	}
	
	public String getGasPtc() {
		res = 1 + random.nextInt(8);
		if (res == 1) {
			gasPtc = "Extreme";
		}
		else if (res == 2) {
			gasPtc = "Intense";
		}
		else if (res == 3) {
			gasPtc = "Strong";
		}
		else if (res == 4) {
			gasPtc = "Significant";
		}
		else if (res == 5) {
			gasPtc = "Notable";
		}
		else if (res == 6) {
			gasPtc = "Mild";
		}
		else if (res == 7) {
			gasPtc = "Subtle";
		}
		else if (res == 8) {
			gasPtc = "Negligible";
		}
		return gasPtc;
	}
	
	public String getGasOpac() {
		res = 1 + random.nextInt(8);
		if (res == 1) {
			gasOpac = "Impenetrable";
		}
		else if (res == 2) {
			gasOpac = "Thick";
		}
		else if (res == 3) {
			gasOpac = "Difficult";
		}
		else if (res >= 4 && res < 6) {
			gasOpac = "Moderate";
		}
		else if (res >= 6 && res < 8) {
			gasOpac = "Light";
		}
		else if (res == 8) {
			gasOpac = "Invisible";
		}
		return gasOpac;
	}
	
	public String getUnderneath() {
		res = 1 + random.nextInt(12);
		if (res >= 1 && res < 3) {
			underneath = "Artificially mined out";
		}
		else if (res >= 3 && res < 6) {
			underneath = "Open Caverns & Chasms";
		}
		else if (res >= 6 && res < 8) {
			underneath = "Aquatic Cavern Subsystem";
		}
		else if (res == 8) {
			underneath = "Gas Bubble Cavern Clusters";
		}
		else if (res >= 9 && res < 12) {
			underneath = "Not Noteworthy Or Practically Accessible";
		}
		else if (res == 12) {
			underneath = "Global Liquid Expanse";
		}
		return underneath;
	}
	
	public String getSurface() {
		res = 1 + random.nextInt(6);
		//There are two sections here, more complex than the other For Loop "Purposes" situation
		//The first assignment according to this outer If statement gives a value to index 0
		//And then, the other For Loop stuff starts WITHIN that If condition, tailored to it
		//Coin flipping for additional Surfaces only happens after index *1* is assigned.
		if (res >= 1 && res < 4) {
			surfaces[0] = "Flat/Non-Tectonic";
			for (int i = 1 ; i < 7 ; i++) {
				res = 1 + random.nextInt(6);
				if (res == 1) {
					surfaces[i] = "Marsh/mud";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Marsh/mud")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 2) {
					surfaces[i] = "Marsh/mud (not water)";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Marsh/mud (not water)")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 3) {
					surfaces[i] = "Flat rock";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Flat rock")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 4) {
					surfaces[i] = "Megalithic formations";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Megalithic formations")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 5) {
					surfaces[i] = "Soft powder terrain";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Soft powder terrain")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 6) {
					surfaces[i] = "Hills";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Hills")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				res = 1 + random.nextInt(2);
				if (res == 1) {
					break;
				}
			}
		}
		else if (res == 4) {
			surfaces[0] = "Continental (Aquatic Oceans)";
			for (int i = 1 ; i < 7 ; i++) {
				res = 1 + random.nextInt(6);
				if (res == 1) {
					surfaces[i] = "Marsh/mud";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Marsh/mud")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 2) {
					surfaces[i] = "Flat rock terrain";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Flat rock terrain")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 3) {
					surfaces[i] = "Megalithic formations";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Megalithic formations")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 4) {
					surfaces[i] = "Soft powder terrain";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Soft powder terrain")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 5) {
					surfaces[i] = "Mountains";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Mountains")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 6) {
					surfaces[i] = "Hills";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Hills")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				res = 1 + random.nextInt(2);
				if (res == 1) {
					break;
				}
			}
		}
		else if (res == 5) {
			surfaces[0] = "Continental (Non-Water Oceans)";
			for (int i = 1 ; i < 7 ; i++) {
				res = 1 + random.nextInt(6);
				if (res == 1) {
					surfaces[i] = "Marsh/mud (not water)";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Marsh/mud (not water)")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 2) {
					surfaces[i] = "Flat rock terrain";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Flat rock terrain")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 3) {
					surfaces[i] = "Megalithic formations";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Megalithic formations")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 4) {
					surfaces[i] = "Soft powder terrain";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Soft powder terrain")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 5) {
					surfaces[i] = "Mountains";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j].equals("Mountains")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 6) {
					surfaces[i] = "Hill and mounds";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Hill and mounds")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				res = 1 + random.nextInt(2);
				if (res == 1) {
					break;
				}
			}
		}
		else if (res == 6) {
			surfaces[0] = "Continental (No Oceans)";
			for (int i = 1 ; i < 7 ; i++) {
				res = 1 + random.nextInt(6);
				if (res == 1) {
					surfaces[i] = "Flat rock terrain";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Flat rock terrain")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 2) {
					surfaces[i] = "Megalithic formations";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Megalithic formations")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 3) {
					surfaces[i] = "Soft powder terrain";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Soft powder terrain")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 4) {
					surfaces[i] = "Mountains";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Mountains")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 5) {
					surfaces[i] = "Hills";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Hills")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 6) {
					surfaces[i] = "Hyperactive volcanic terrain";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Hyperactive volcanic terrain")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				res = 1 + random.nextInt(2);
				if (res == 1) {
					break;
				}
			}
		}
		else if (res == 7) {
			surfaces[0] = "Aquatic Submerged";
			for (int i = 1 ; i < 7 ; i++) {
				res = 1 + random.nextInt(6);
				if (res == 1) {
					surfaces[i] = "Generic";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Generic")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 2) {
					surfaces[i] = "Generic";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Generic")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 3) {
					surfaces[i] = "Generic";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Generic")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 4) {
					surfaces[i] = "Megalithic formations";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Megalithic formations")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 5) {
					surfaces[i] = "Mountains";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Mountains")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 6) {
					surfaces[i] = "Hills";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Hills")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				res = 1 + random.nextInt(2);
				if (res == 1) {
					break;
				}
			}
		}
		else if (res == 8) {
			surfaces[0] = "Submerged (Non-Water)";
			for (int i = 1 ; i < 7 ; i++) {
				res = 1 + random.nextInt(6);
				if (res == 1) {
					surfaces[i] = "Generic";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Generic")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 2) {
					surfaces[i] = "Generic";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Generic")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 3) {
					surfaces[i] = "Generic";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Generic")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 4) {
					surfaces[i] = "Megalithic formations";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Megalithic formations")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 5) {
					surfaces[i] = "Mountains";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Mountains")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 6) {
					surfaces[i] = "Hills";
					if (i > 1) {
						for (int j = 0 ; j < i ; j++) {
							if (surfaces[j] != null && surfaces[j].equals("Hills")) {
								surfaces[i] = null;
								break;
							}
						}
					}
				}
				res = 1 + random.nextInt(2);
				if (res == 1) {
					break;
				}
			}
		}
		//As per the fact index 0 and 1 must have a value assigned, we only
		//check for null starting at 2
		if (surfaces[2] == null) {
			return surfaces[0] +", with biomes: " +surfaces[1];
		}
		if (surfaces[3] == null) {
			return surfaces[0] +", with biomes: " +surfaces[1] +" and " +surfaces[2];
		}
		else if (surfaces[4] == null) {
			return surfaces[0] +", with biomes: " +surfaces[1] +" and " +surfaces[2] +" and " +surfaces[3];
		}
		else if (surfaces[4] == null) {
			return surfaces[0] +", with biomes: " +surfaces[1] +" and " +surfaces[2] +" and " +surfaces[3] +" and " +surfaces[4];
		}
		else if (surfaces[5] == null) {
			return surfaces[0] +", with biomes: " +surfaces[1] +" and " +surfaces[2] +" and " +surfaces[3] +" and " +surfaces[4] +" and " +surfaces[5];
		}
		else {
			return surfaces[0] +", with biomes: " +surfaces[1] +" and " +surfaces[2] +" and " +surfaces[3] +" and " +surfaces[4] +" and " +surfaces[5] +" and " +surfaces[6];
		}
	}
	
	public String getOceanic() {
		res = 1 + random.nextInt(6);
		if (res == 1) {
			oceanic = "Harmless";
		}
		else if (res == 2) {
			oceanic = "Nauseating";
		}
		else if (res == 3) {
			oceanic = "Suffocating";
		}
		else if (res == 4) {
			oceanic = "Toxic";
		}
		else if (res == 5) {
			oceanic = "Acidic";
		}
		else if (res == 6) {
			oceanic = "Burning";
		}
		return oceanic;
	}
		
	public String getLiquidPtc() {
		res = 1 + random.nextInt(8);
		if (res == 1) {
			liquidPtc = "Extreme";
		}
		else if (res == 2) {
			liquidPtc = "Intense";
		}
		else if (res == 3) {
			liquidPtc = "Strong";
		}
		else if (res == 4) {
			liquidPtc = "Significant";
		}
		else if (res == 5) {
			liquidPtc = "Notable";
		}
		else if (res == 6) {
			liquidPtc = "Mild";
		}
		else if (res == 7) {
			liquidPtc = "Subtle";
		}
		else if (res == 8) {
			liquidPtc = "Negligible";
		}
		return gasPtc;
	}
	
	public String getLiquidOpac() {
		res = 1 + random.nextInt(8);
		if (res == 1) {
			gasOpac = "Impenetrable";
		}
		else if (res == 2) {
			gasOpac = "Thick";
		}
		else if (res == 3) {
			gasOpac = "Difficult";
		}
		else if (res >= 4 && res <6) {
			gasOpac = "Moderate";
		}
		else if (res >= 6 && res < 8) {
			gasOpac = "Light";
		}
		else if (res == 8) {
			gasOpac = "Clear";
		}
		return gasOpac;
	}
	
	public String getPlants() {
		
		if (biodiversity.equals("0")) {
			return "None";
		}
		//Another one of my For Loop nests, but only applies if Biodiversity is not "0" (string, not int)
		else {
		res = 1 + random.nextInt(8);
		if (res >= 2) {
			for (int i = 0 ; i < 6 ; i++) {
				res = 1 + random.nextInt(6);
				if (res == 1) {
					plants[i] = "Mosses";
					if (i > 0) {
						for (int j = 0 ; j < i ; j++) {
							if (plants[j] != null && plants[j].equals("Mosses")) {
								plants[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 2) {
					plants[i] = "Grasses";
					if (i > 0) {
						for (int j = 0 ; j < i ; j++) {
							if (plants[j] != null && plants[j].equals("Grasses")) {
								plr++;
								plants[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 3) {
					plants[i] = "Bushes";
					if (i > 0) {
						for (int j = 0 ; j < i ; j++) {
							if (plants[j] != null && plants[j].equals("Bushes")) {
								plr++;
								plants[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 4) {
					plants[i] = "Forests";
					if (i > 0) {
						for (int j = 0 ; j < i ; j++) {
							if (plants[j] != null && plants[j].equals("Forests")) {
								plr++; plr++;
								plants[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 5) {
					plants[i] = "Fungi";
					if (i > 0) {
						for (int j = 0 ; j < i ; j++) {
							if (plants[j] != null && plants[j].equals("Fungi")) {
								plants[i] = null;
								break;
							}
						}
					}
				}
				else if (res == 6) {
					plants[i] = "Exotic Growths";
					if (i > 0) {
						for (int j = 0 ; j < i ; j++) {
							if (plants[j] != null && plants[j].equals("Exotic Growths")) {
								plants[i] = null;
								break;
							}
						}
					}
				}
				/*if (8+plr <= 12) {
					res = 1 + random.nextInt(8+plr);
					if (res >= 5) {
						break;
					}
				}*/
				else {
					res = 1 + random.nextInt(12);
					if (res >= 5) {
						break;
					}
				}
			}
			if (plants[1] == null) {
				return plants[0];
			}
			else if (plants[2] == null) {
				return plants[0] +" and " +plants[1];
			}
			else if (plants[3] == null) {
				return plants[0] +" and " +plants[1] +" and " +plants[2];
			}
			else if (plants[4] == null) {
				return plants[0] +" and " +plants[1] +" and " +plants[2] +" and " +plants[3];
			}
			else if (plants[4] == null) {
				return plants[0] +" and " +plants[1] +" and " +plants[2] +" and " +plants[3] +" and " +plants[4];
			}
			else {
				return plants[0] +" and " +plants[1] +" and " +plants[2] +" and " +plants[3] +" and " +plants[4] +" and " +plants[5];
			}
		}
		else {
			return "None";
		}
		}
	}
	
	public String getAnimalLife() {
		if (biodiversity.equals("0")) {
			return "None";
		}
		else if (biodiversity.contentEquals("<20") || biodiversity.contentEquals("20-500") || biodiversity.contentEquals("500-2000")) {
			res = 1 + random.nextInt(6);
			if (res == 1) {
				animalLife = "All";
			}
			else if (res == 2) {
				animalLife = "No Airborne";
			}
			else if (res == 3) {
				animalLife = "No Aquatic";
			}
			else if (res == 4) {
				animalLife = "Nothing Above the Surface";
			}
			else if (res == 5) {
				animalLife = "Terrestrial Only";
			}
			else if (res == 6) {
				animalLife = "Mostly Airborne";
			}
			return animalLife;
		}
		else {
			res = 1 + random.nextInt(6);
			if (res >= 1 && res < 4) {
				animalLife = "All";
			}
			else if (res == 4) {
				animalLife = "No Airborne";
			}
			else if (res == 5) {
				animalLife = "No Aquatic";
			}
			else if (res == 6) {
				animalLife = "Nothing Above the Surface";
			}
			else if (res == 7) {
				animalLife = "Terrestrial Only";
			}
			else if (res >= 8) {
				animalLife = "Mostly Airborne";
			}
			return animalLife;
		}
	}
	
	public String getSentience() {
		if (animalLife.equals("None")) {
			return "None";
		}
		else {
			for (int i = 0 ; i < 20 ; i++) {
				res = 1 + random.nextInt(20);
				if (res >= 1 && res < 6) {
					//sct is a counter so I can put a number in the middle of a statement about races
					sct++;
					sentience = "Yes, " +sct +" race(s)";
				}
				else {
					sentience = "No";
					break;
				}
			}
			return sentience;
		}
	}
	
	public String getNativeSetStyle() {
		//Also, conveniently I get to check the sentient life counter (sct) as a condition here
		if (sct < 1) {
			return "N/A";
		}
		else {
			res = 1 + random.nextInt(6);
			if (res == 1) {
				nativeSetStyle = "Scattered Network";
			}
			else if (res == 2) {
				nativeSetStyle = "Large Single Contiguous Structures";
			}
			else if (res == 3) {
				nativeSetStyle = "Metropolitan";
			}
			else if (res == 4) {
				nativeSetStyle = "Metro-Dense";
			}
			else if (res == 5) {
				nativeSetStyle = "Towns";
			}
			else if (res == 6) {
				nativeSetStyle = "Villages";
			}
			return nativeSetStyle;
		}
	}
	
	public String getNativeSetLoc() {
		if (sct < 1) {
			return "N/A";
		}
		else {
			res = 1 + random.nextInt(6);
			if (res == 1) {
				nativeSetLoc = "Surface";
			}
			else if (res == 2) {
				nativeSetLoc = "Caves Underground";
			}
			else if (res == 3) {
				nativeSetLoc = "Undersurface (not subterranean)";
			}
			else if (res == 4) {
				nativeSetLoc = "Mountain Cliffs";
			}
			else if (res == 5) {
				nativeSetLoc = "Floating (Oceanic)";
			}
			else if (res >= 6) {
				nativeSetLoc = "Floating (Sky)";
			}
			return nativeSetLoc;
		}
	}
	
	public String getNativeWorldPop() {
		if (sct < 1) {
			return "N/A";
		}
		else {
			res = 1 + random.nextInt(8);
			if (res == 1) {
				nativeWorldPop = "<10K";
			}
			else if (res == 2) {
				nativeWorldPop = "10K-100K";
			}
			else if (res == 3) {
				nativeWorldPop = "100K-1M";
			}
			else if (res == 4) {
				nativeWorldPop = "1M-10M";
			}
			else if (res == 5) {
				nativeWorldPop = "10M-100M";
			}
			else if (res == 6) {
				nativeWorldPop = "100M-1B";
			}
			else if (res == 7) {
				nativeWorldPop = "1B-10B";
			}
			else if (res == 8) {
				nativeWorldPop = "10B-100B";
			}
			return nativeWorldPop;
		}
	}
	
	public String getDependency() {
		//Life can't be dependent on water if planet type doesn't support water
		if (surfaces[0].contentEquals("Flat/Non-Tectonic") || surfaces[0].contentEquals("Continental (Non-Water Oceans)") || surfaces[0].contentEquals("Continental (No Oceans)") || surfaces[0].contentEquals("Submerged (Non-Water)")) {
			return "No";
		}
		//Or otherwise it's 80% chance that life needs water, just because
		else {
			res = 1 + random.nextInt(6);
			if (res >= 3) {
				return "Yes";
			}
			else {
				return "No";
			}
		}
	}
	
	
	
	//Override toString()
	public String toString() {
		return "\nStatus: " +status +"\nBiodiversity (~# of taxonomic families): " +biodiversity +"\nPlant Life: " +plant +"\nAnimal Life: " +animalLife +"\nLife Dependent On Water?: " +water +"\nGalactic Purposes: " +purpose +"\nColony World Population: " +colonyWorldPop +"\nColony Settlements: " +colonySetStyle +"\nColony Settlement Preferred Location: " +colonySetLoc +"\nSentient Life?: " +sentience +"\nNative World Population: " +nativeWorldPop +"\nNative Settlements: " +nativeSetStyle +"\nNative Settlement Preferred Location: " +nativeSetLoc +"\nAtmospheric State: " +atmosphere +"\nPrecipitation Tendency: " +precipitation +"\nAir: " +air +"\nAir Potency: " +airPtc +"\nAir Opacity: " +airOpac +"\nPlanet Characteristic: " +surface +"\nBeneath Surface: " +underneath +"\nOceans: " +oceanic +"\nOcean Potency: " +liquidPtc +"\nOcean Opacity: " +liquidOpac +"\nAdditional Outside Conditions: " +outsideCdtnPlus +"\nAdditional Abundant Gas: " +gas +"\nGas Potency: " +gasPtc +"\nGas Opacity: " +gasOpac +"\n";
	}

}
