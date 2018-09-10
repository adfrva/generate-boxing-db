import java.util.Random;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.Writer;
import java.util.ArrayList;

public class generator {
		public static String[] firstNames = {"JAMES", "JOHN", "ROBERT", "MICHAEL", "WILLIAM", "DAVID", "RICHARD", "CHARLES", "JOSEPH", "THOMAS", "CHRISTOPHER", "DANIEL", "PAUL", "MARK", "DONALD", "GEORGE", "KENNETH", "STEVEN", "EDWARD", "BRIAN", "RONALD", "ANTHONY", "KEVIN", "JASON", "MATTHEW", "GARY", "TIMOTHY", "JOSE", "LARRY", "JEFFREY", "FRANK", "SCOTT", "ERIC", "STEPHEN", "ANDREW", "RAYMOND", "GREGORY", "JOSHUA", "JERRY", "DENNIS", "WALTER", "PATRICK", "PETER", "HAROLD", "DOUGLAS", "HENRY", "CARL", "ARTHUR", "RYAN", "ROGER", "JOE", "JUAN", "JACK", "ALBERT", "JONATHAN", "JUSTIN", "TERRY", "GERALD", "KEITH", "SAMUEL", "WILLIE", "RALPH", "LAWRENCE", "NICHOLAS", "ROY", "BENJAMIN", "BRUCE", "BRANDON", "ADAM", "HARRY", "FRED", "WAYNE", "BILLY", "STEVE", "LOUIS", "JEREMY", "AARON", "RANDY", "HOWARD", "EUGENE", "CARLOS", "RUSSELL", "BOBBY", "VICTOR", "MARTIN", "ERNEST", "PHILLIP", "TODD", "JESSE", "CRAIG", "ALAN", "SHAWN", "CLARENCE", "SEAN", "PHILIP", "CHRIS", "JOHNNY", "EARL", "JIMMY", "ANTONIO", "DANNY", "BRYAN", "TONY", "LUIS", "MIKE", "STANLEY", "LEONARD", "NATHAN", "DALE", "MANUEL", "RODNEY", "CURTIS", "NORMAN", "ALLEN", "MARVIN", "VINCENT", "GLENN", "JEFFERY", "TRAVIS", "JEFF", "CHAD", "JACOB", "LEE", "MELVIN", "ALFRED", "KYLE", "FRANCIS", "BRADLEY", "JESUS", "HERBERT", "FREDERICK", "RAY", "JOEL", "EDWIN", "DON", "EDDIE", "RICKY", "TROY", "RANDALL", "BARRY", "ALEXANDER", "BERNARD", "MARIO", "LEROY", "FRANCISCO", "MARCUS", "MICHEAL", "THEODORE", "CLIFFORD", "MIGUEL", "OSCAR", "JAY", "JIM", "TOM", "CALVIN", "ALEX", "JON", "RONNIE", "BILL", "LLOYD", "TOMMY", "LEON", "DEREK", "WARREN", "DARRELL", "JEROME", "FLOYD", "LEO", "ALVIN", "TIM", "WESLEY", "GORDON", "DEAN", "GREG", "JORGE", "DUSTIN", "PEDRO", "DERRICK", "DAN", "LEWIS", "ZACHARY", "COREY", "HERMAN", "MAURICE", "VERNON", "ROBERTO", "CLYDE", "GLEN", "HECTOR", "SHANE", "RICARDO", "SAM", "RICK", "LESTER", "BRENT", "RAMON", "CHARLIE", "TYLER", "GILBERT", "GENE", "MARC", "REGINALD", "RUBEN", "BRETT", "ANGEL", "NATHANIEL", "RAFAEL", "LESLIE", "EDGAR", "MILTON", "RAUL", "BEN", "CHESTER", "CECIL", "DUANE", "FRANKLIN", "ANDRE", "ELMER", "BRAD", "GABRIEL", "RON", "MITCHELL", "ROLAND", "ARNOLD", "HARVEY", "JARED", "ADRIAN", "KARL", "CORY", "CLAUDE", "ERIK", "DARRYL", "JAMIE", "NEIL", "JESSIE", "CHRISTIAN", "JAVIER", "FERNANDO", "CLINTON", "TED", "MATHEW", "TYRONE", "DARREN", "LONNIE", "LANCE", "CODY", "JULIO", "KELLY", "KURT", "ALLAN", "NELSON", "GUY", "CLAYTON", "HUGH", "MAX", "DWAYNE", "DWIGHT", "ARMANDO", "FELIX", "JIMMIE", "EVERETT", "JORDAN", "IAN", "WALLACE", "KEN", "BOB", "JAIME", "CASEY", "ALFREDO", "ALBERTO", "DAVE", "IVAN", "JOHNNIE", "SIDNEY", "BYRON", "JULIAN", "ISAAC", "MORRIS", "CLIFTON", "WILLARD", "DARYL", "ROSS", "VIRGIL", "ANDY", "MARSHALL", "SALVADOR", "PERRY", "KIRK", "SERGIO", "MARION", "TRACY", "SETH", "KENT", "TERRANCE", "RENE", "EDUARDO", "TERRENCE", "ENRIQUE", "FREDDIE", "WADE", "AUSTIN", "STUART", "FREDRICK", "ARTURO", "ALEJANDRO", "JACKIE", "JOEY", "NICK", "LUTHER", "WENDELL", "JEREMIAH", "EVAN", "JULIUS", "DANA", "DONNIE", "OTIS", "SHANNON", "TREVOR", "OLIVER", "LUKE", "HOMER", "GERARD", "DOUG", "KENNY", "HUBERT", "ANGELO", "SHAUN", "LYLE", "MATT", "LYNN", "ALFONSO", "ORLANDO", "REX", "CARLTON", "ERNESTO", "CAMERON", "NEAL", "PABLO", "LORENZO", "OMAR", "WILBUR", "BLAKE", "GRANT", "HORACE", "RODERICK", "KERRY", "ABRAHAM", "WILLIS", "RICKEY", "JEAN", "IRA", "ANDRES", "CESAR", "JOHNATHAN", "MALCOLM", "RUDOLPH", "DAMON", "KELVIN", "RUDY", "PRESTON", "ALTON", "ARCHIE", "MARCO", "WM", "PETE", "RANDOLPH", "GARRY", "GEOFFREY", "JONATHON", "FELIPE", "BENNIE", "GERARDO", "ED", "DOMINIC", "ROBIN", "LOREN", "DELBERT", "COLIN", "GUILLERMO", "EARNEST", "LUCAS", "BENNY", "NOEL", "SPENCER", "RODOLFO", "MYRON", "EDMUND", "GARRETT", "SALVATORE", "CEDRIC", "LOWELL", "GREGG", "SHERMAN", "WILSON", "DEVIN", "SYLVESTER", "KIM", "ROOSEVELT", "ISRAEL", "JERMAINE", "FORREST", "WILBERT", "LELAND", "SIMON", "GUADALUPE", "CLARK", "IRVING", "CARROLL", "BRYANT", "OWEN", "RUFUS", "WOODROW", "SAMMY", "KRISTOPHER", "MACK", "LEVI", "MARCOS", "GUSTAVO", "JAKE", "LIONEL", "MARTY", "TAYLOR", "ELLIS", "DALLAS", "GILBERTO", "CLINT", "NICOLAS", "LAURENCE", "ISMAEL", "ORVILLE", "DREW", "JODY", "ERVIN", "DEWEY", "AL", "WILFRED", "JOSH", "HUGO", "IGNACIO", "CALEB", "TOMAS", "SHELDON", "ERICK", "FRANKIE", "STEWART", "DOYLE", "DARREL", "ROGELIO", "TERENCE", "SANTIAGO", "ALONZO", "ELIAS", "BERT", "ELBERT", "RAMIRO", "CONRAD", "PAT", "NOAH", "GRADY", "PHIL", "CORNELIUS", "LAMAR", "ROLANDO", "CLAY", "PERCY", "DEXTER", "BRADFORD", "MERLE", "DARIN", "AMOS", "TERRELL", "MOSES", "IRVIN", "SAUL", "ROMAN", "DARNELL", "RANDAL", "TOMMIE", "TIMMY", "DARRIN", "WINSTON", "BRENDAN", "TOBY", "VAN", "ABEL", "DOMINICK", "BOYD", "COURTNEY", "JAN", "EMILIO", "ELIJAH", "CARY", "DOMINGO", "SANTOS", "AUBREY", "EMMETT", "MARLON", "EMANUEL", "JERALD", "EDMOND", "EMIL", "DEWAYNE", "WILL", "OTTO", "TEDDY", "REYNALDO", "BRET", "MORGAN", "JESS", "TRENT", "HUMBERTO", "EMMANUEL", "STEPHAN", "LOUIE", "VICENTE", "LAMONT", "STACY", "GARLAND", "MILES", "MICAH", "EFRAIN", "BILLIE", "LOGAN", "HEATH", "RODGER", "HARLEY", "DEMETRIUS", "ETHAN", "ELDON", "ROCKY", "PIERRE", "JUNIOR", "FREDDY", "ELI", "BRYCE", "ANTOINE", "ROBBIE", "KENDALL", "ROYCE", "STERLING", "MICKEY", "CHASE", "GROVER", "ELTON", "CLEVELAND", "DYLAN", "CHUCK", "DAMIAN", "REUBEN", "STAN", "AUGUST", "LEONARDO", "JASPER", "RUSSEL", "ERWIN", "BENITO", "HANS", "MONTE", "BLAINE", "ERNIE", "CURT", "QUENTIN", "AGUSTIN", "MURRAY", "JAMAL", "DEVON", "ADOLFO", "HARRISON", "TYSON", "BURTON", "BRADY", "ELLIOTT", "WILFREDO", "BART", "JARROD", "VANCE", "DENIS", "DAMIEN", "JOAQUIN", "HARLAN", "DESMOND", "ELLIOT", "DARWIN", "ASHLEY", "GREGORIO", "BUDDY", "XAVIER", "KERMIT", "ROSCOE", "ESTEBAN", "ANTON", "SOLOMON", "SCOTTY", "NORBERT", "ELVIN", "WILLIAMS", "NOLAN", "CAREY", "ROD", "QUINTON", "HAL", "BRAIN", "ROB", "ELWOOD", "KENDRICK", "DARIUS", "MOISES", "SON", "MARLIN", "FIDEL", "THADDEUS", "CLIFF", "MARCEL", "ALI", "JACKSON", "RAPHAEL", "BRYON", "ARMAND", "ALVARO", "JEFFRY", "DANE", "JOESPH", "THURMAN", "NED", "SAMMIE", "RUSTY", "MICHEL", "MONTY", "RORY", "FABIAN", "REGGIE", "MASON", "GRAHAM", "KRIS", "ISAIAH", "VAUGHN", "GUS", "AVERY", "LOYD", "DIEGO", "ALEXIS", "ADOLPH", "NORRIS", "MILLARD", "ROCCO", "GONZALO", "DERICK", "RODRIGO", "GERRY", "STACEY", "CARMEN", "WILEY", "RIGOBERTO", "ALPHONSO", "TY", "SHELBY", "RICKIE", "NOE", "VERN", "BOBBIE", "REED", "JEFFERSON", "ELVIS", "BERNARDO", "MAURICIO", "HIRAM", "DONOVAN", "BASIL", "RILEY", "OLLIE", "NICKOLAS", "MAYNARD", "SCOT", "VINCE", "QUINCY", "EDDY", "SEBASTIAN", "FEDERICO", "ULYSSES", "HERIBERTO", "DONNELL", "COLE", "DENNY", "DAVIS", "GAVIN", "EMERY", "WARD", "ROMEO", "JAYSON", "DION", "DANTE", "CLEMENT", "COY", "ODELL", "MAXWELL", "JARVIS", "BRUNO", "ISSAC", "MARY", "DUDLEY", "BROCK", "SANFORD", "COLBY", "CARMELO", "BARNEY", "NESTOR", "HOLLIS", "STEFAN", "DONNY", "ART", "LINWOOD", "BEAU", "WELDON", "GALEN", "ISIDRO", "TRUMAN", "DELMAR", "JOHNATHON", "SILAS", "FREDERIC", "DICK", "KIRBY", "IRWIN", "CRUZ", "MERLIN", "MERRILL", "CHARLEY", "MARCELINO", "LANE", "HARRIS", "CLEO", "CARLO", "TRENTON", "KURTIS", "HUNTER", "AURELIO", "WINFRED", "VITO", "COLLIN", "DENVER", "CARTER", "LEONEL", "EMORY", "PASQUALE", "MOHAMMAD", "MARIANO", "DANIAL", "BLAIR", "LANDON", "DIRK", "BRANDEN", "ADAN", "NUMBERS", "CLAIR", "BUFORD", "GERMAN", "BERNIE", "WILMER", "JOAN", "EMERSON", "ZACHERY", "FLETCHER", "JACQUES", "ERROL", "DALTON", "MONROE", "JOSUE", "DOMINIQUE", "EDWARDO", "BOOKER", "WILFORD", "SONNY", "SHELTON", "CARSON", "THERON", "RAYMUNDO", "DAREN", "TRISTAN", "HOUSTON", "ROBBY", "LINCOLN", "JAME", "GENARO", "GALE", "BENNETT", "OCTAVIO", "CORNELL", "LAVERNE", "HUNG", "ARRON", "ANTONY", "HERSCHEL", "ALVA", "GIOVANNI", "GARTH", "CYRUS", "CYRIL", "RONNY", "STEVIE", "LON", "FREEMAN", "ERIN", "DUNCAN", "KENNITH", "CARMINE", "AUGUSTINE", "YOUNG", "ERICH", "CHADWICK", "WILBURN", "RUSS", "REID", "MYLES", "ANDERSON", "MORTON", "JONAS", "FOREST", "MITCHEL", "MERVIN", "ZANE", "RICH", "JAMEL", "LAZARO", "ALPHONSE", "RANDELL", "MAJOR", "JOHNIE", "JARRETT", "BROOKS", "ARIEL", "ABDUL", "DUSTY", "LUCIANO", "LINDSEY", "TRACEY", "SEYMOUR", "SCOTTIE", "EUGENIO", "MOHAMMED", "SANDY", "VALENTIN", "CHANCE", "ARNULFO", "LUCIEN", "FERDINAND", "THAD", "EZRA", "SYDNEY", "ALDO", "RUBIN", "ROYAL", "MITCH", "EARLE", "ABE", "WYATT", "MARQUIS", "LANNY", "KAREEM", "JAMAR", "BORIS", "ISIAH", "EMILE", "ELMO", "ARON", "LEOPOLDO", "EVERETTE", "JOSEF", "GAIL", "ELOY", "DORIAN", "RODRICK", "REINALDO", "LUCIO", "JERROD", "WESTON", "HERSHEL", "BARTON", "PARKER", "LEMUEL", "LAVERN", "BURT", "JULES", "GIL", "ELISEO", "AHMAD", "NIGEL", "EFREN", "ANTWAN", "ALDEN", "MARGARITO", "COLEMAN", "REFUGIO", "DINO", "OSVALDO", "LES", "DEANDRE", "NORMAND", "KIETH", "IVORY", "ANDREA", "TREY", "NORBERTO", "NAPOLEON", "JEROLD", "FRITZ", "ROSENDO", "MILFORD", "SANG", "DEON", "CHRISTOPER", "ALFONZO", "LYMAN", "JOSIAH", "BRANT", "WILTON", "RICO", "JAMAAL", "DEWITT", "CAROL", "BRENTON", "YONG", "OLIN", "FOSTER", "FAUSTINO", "CLAUDIO", "JUDSON", "GINO", "EDGARDO", "BERRY", "ALEC", "TANNER", "JARRED", "DONN", "TRINIDAD", "TAD", "SHIRLEY", "PRINCE", "PORFIRIO", "ODIS", "MARIA", "LENARD", "CHAUNCEY", "CHANG", "TOD", "MEL", "MARCELO", "KORY", "AUGUSTUS", "KEVEN", "HILARIO", "BUD", "SAL", "ROSARIO", "ORVAL", "MAURO", "DANNIE", "ZACHARIAH", "OLEN", "ANIBAL", "MILO", "JED", "FRANCES", "THANH", "DILLON", "AMADO", "NEWTON", "CONNIE", "LENNY", "TORY", "RICHIE", "LUPE", "HORACIO", "BRICE", "MOHAMED", "DELMER", "DARIO", "REYES", "DEE", "MAC", "JONAH", "JERROLD", "ROBT", "HANK", "SUNG", "RUPERT", "ROLLAND", "KENTON", "DAMION", "CHI", "ANTONE", "WALDO", "FREDRIC", "BRADLY", "QUINN", "KIP", "BURL", "WALKER", "TYREE", "JEFFEREY", "AHMED", "WILLY", "STANFORD", "OREN", "NOBLE", "MOSHE", "MIKEL", "ENOCH", "BRENDON", "QUINTIN", "JAMISON", "FLORENCIO", "DARRICK", "TOBIAS", "MINH", "HASSAN", "GIUSEPPE", "DEMARCUS", "CLETUS", "TYRELL", "LYNDON", "KEENAN", "WERNER", "THEO", "GERALDO", "LOU", "COLUMBUS", "CHET", "BERTRAM", "MARKUS", "HUEY", "HILTON", "DWAIN", "DONTE", "TYRON", "OMER", "ISAIAS", "HIPOLITO", "FERMIN", "CHUNG", "ADALBERTO", "VALENTINE", "JAMEY", "BO", "BARRETT", "WHITNEY", "TEODORO", "MCKINLEY", "MAXIMO", "GARFIELD", "SOL", "RALEIGH", "LAWERENCE", "ABRAM", "RASHAD", "KING", "EMMITT", "DARON", "CHONG", "SAMUAL", "PARIS", "OTHA", "MIQUEL", "LACY", "EUSEBIO", "DONG", "DOMENIC", "DARRON", "BUSTER", "ANTONIA", "WILBER", "RENATO", "JC", "HOYT", "HAYWOOD", "EZEKIEL", "CHAS", "FLORENTINO", "ELROY", "CLEMENTE", "ARDEN", "NEVILLE", "KELLEY", "EDISON", "DESHAWN", "CARROL", "SHAYNE", "NATHANIAL", "JORDON", "DANILO", "CLAUD", "VAL", "SHERWOOD", "RAYMON", "RAYFORD", "CRISTOBAL", "AMBROSE", "TITUS", "HYMAN", "FELTON", "EZEQUIEL", "ERASMO", "STANTON", "LONNY", "LEN", "IKE", "MILAN", "LINO", "JAROD", "HERB", "ANDREAS", "WALTON", "RHETT", "PALMER", "JUDE", "DOUGLASS", "CORDELL", "OSWALDO", "ELLSWORTH", "VIRGILIO", "TONEY", "NATHANAEL", "DEL", "BRITT", "BENEDICT", "MOSE", "HONG", "LEIGH", "JOHNSON", "ISREAL", "GAYLE", "GARRET", "FAUSTO", "ASA", "ARLEN", "ZACK", "WARNER", "MODESTO", "FRANCESCO", "MANUAL", "JAE", "GAYLORD", "GASTON", "FILIBERTO", "DEANGELO", "MICHALE", "GRANVILLE", "WES", "MALIK", "ZACKARY", "TUAN", "NICKY", "ELDRIDGE", "CRISTOPHER", "CORTEZ", "ANTIONE", "MALCOM", "LONG", "KOREY", "JOSPEH", "COLTON", "WAYLON", "VON", "HOSEA", "SHAD", "SANTO", "RUDOLF", "ROLF", "REY", "RENALDO", "MARCELLUS", "LUCIUS", "LESLEY", "KRISTOFER", "BOYCE", "BENTON", "MAN", "KASEY", "JEWELL", "HAYDEN", "HARLAND", "ARNOLDO", "RUEBEN", "LEANDRO", "KRAIG", "JERRELL", "JEROMY", "HOBERT", "CEDRICK", "ARLIE", "WINFORD", "WALLY", "PATRICIA", "LUIGI", "KENETH", "JACINTO", "GRAIG", "FRANKLYN", "EDMUNDO", "SID", "PORTER", "LEIF", "LAUREN", "JERAMY", "ELISHA", "BUCK", "WILLIAN", "VINCENZO", "SHON", "MICHAL", "LYNWOOD", "LINDSAY", "JEWEL", "JERE", "HAI", "ELDEN", "DORSEY", "DARELL", "BRODERICK", "ALONSO"};
		public static String[] lastNames = {"SMITH", "JOHNSON", "WILLIAMS", "JONES", "BROWN", "DAVIS", "MILLER", "WILSON", "MOORE", "TAYLOR", "ANDERSON", "THOMAS", "JACKSON", "WHITE", "HARRIS", "MARTIN", "THOMPSON", "GARCIA", "MARTINEZ", "ROBINSON", "CLARK", "RODRIGUEZ", "LEWIS", "LEE", "WALKER", "HALL", "ALLEN", "YOUNG", "HERNANDEZ", "KING", "WRIGHT", "LOPEZ", "HILL", "SCOTT", "GREEN", "ADAMS", "BAKER", "GONZALEZ", "NELSON", "CARTER", "MITCHELL", "PEREZ", "ROBERTS", "TURNER", "PHILLIPS", "CAMPBELL", "PARKER", "EVANS", "EDWARDS", "COLLINS", "STEWART", "SANCHEZ", "MORRIS", "ROGERS", "REED", "COOK", "MORGAN", "BELL", "MURPHY", "BAILEY", "RIVERA", "COOPER", "RICHARDSON", "COX", "HOWARD", "WARD", "TORRES", "PETERSON", "GRAY", "RAMIREZ", "JAMES", "WATSON", "BROOKS", "KELLY", "SANDERS", "PRICE", "BENNETT", "WOOD", "BARNES", "ROSS", "HENDERSON", "COLEMAN", "JENKINS", "PERRY", "POWELL", "LONG", "PATTERSON", "HUGHES", "FLORES", "WASHINGTON", "BUTLER", "SIMMONS", "FOSTER", "GONZALES", "BRYANT", "ALEXANDER", "RUSSELL", "GRIFFIN", "DIAZ", "HAYES", "MYERS", "FORD", "HAMILTON", "GRAHAM", "SULLIVAN", "WALLACE", "WOODS", "COLE", "WEST", "JORDAN", "OWENS", "REYNOLDS", "FISHER", "ELLIS", "HARRISON", "GIBSON", "MCDONALD", "CRUZ", "MARSHALL", "ORTIZ", "GOMEZ", "MURRAY", "FREEMAN", "WELLS", "WEBB", "SIMPSON", "STEVENS", "TUCKER", "PORTER", "HUNTER", "HICKS", "CRAWFORD", "HENRY", "BOYD", "MASON", "MORALES", "KENNEDY", "WARREN", "DIXON", "RAMOS", "REYES", "BURNS", "GORDON", "SHAW", "HOLMES", "RICE", "ROBERTSON", "HUNT", "BLACK", "DANIELS", "PALMER", "MILLS", "NICHOLS", "GRANT", "KNIGHT", "FERGUSON", "ROSE", "STONE", "HAWKINS", "DUNN", "PERKINS", "HUDSON", "SPENCER", "GARDNER", "STEPHENS", "PAYNE", "PIERCE", "BERRY", "MATTHEWS", "ARNOLD", "WAGNER", "WILLIS", "RAY", "WATKINS", "OLSON", "CARROLL", "DUNCAN", "SNYDER", "HART", "CUNNINGHAM", "BRADLEY", "LANE", "ANDREWS", "RUIZ", "HARPER", "FOX", "RILEY", "ARMSTRONG", "CARPENTER", "WEAVER", "GREENE", "LAWRENCE", "ELLIOTT", "CHAVEZ", "SIMS", "AUSTIN", "PETERS", "KELLEY", "FRANKLIN", "LAWSON", "FIELDS", "GUTIERREZ", "RYAN", "SCHMIDT", "CARR", "VASQUEZ", "CASTILLO", "WHEELER", "CHAPMAN", "OLIVER", "MONTGOMERY", "RICHARDS", "WILLIAMSON", "JOHNSTON", "BANKS", "MEYER", "BISHOP", "MCCOY", "HOWELL", "ALVAREZ", "MORRISON", "HANSEN", "FERNANDEZ", "GARZA", "HARVEY", "LITTLE", "BURTON", "STANLEY", "NGUYEN", "GEORGE", "JACOBS", "REID", "KIM", "FULLER", "LYNCH", "DEAN", "GILBERT", "GARRETT", "ROMERO", "WELCH", "LARSON", "FRAZIER", "BURKE", "HANSON", "DAY", "MENDOZA", "MORENO", "BOWMAN", "MEDINA", "FOWLER", "BREWER", "HOFFMAN", "CARLSON", "SILVA", "PEARSON", "HOLLAND", "DOUGLAS", "FLEMING", "JENSEN", "VARGAS", "BYRD", "DAVIDSON", "HOPKINS", "MAY", "TERRY", "HERRERA", "WADE", "SOTO", "WALTERS", "CURTIS", "FITZHENRY", "FISHBEIN", "FINTON", "FILMORE", "FILICE", "FEOLA", "FELBERBAUM", "FAUSNAUGHT", "FASCIANO", "FARRAH", "FARQUHARSON", "FAIRES", "ESTRIDGE", "ESSMAN", "ENZ", "ENRIQUES", "EMMICK", "EKKER", "EKDAHL", "EISMAN", "EGGLETON", "EDDINGER", "EAKLE", "EAGAR", "DURIO", "DUNWOODY", "DUHAIME", "DUENES", "DUDEN", "DUDAS", "DRESHER", "DRESEL", "DOUTT", "DONLAN", "DONATHAN", "DOMKE", "DOBROWOLSKI", "DINGEE", "DIMMITT", "DIMERY", "DILULLO", "DEVEAUX", "DEVALLE", "DESPER", "DESNOYERS", "DESAUTELS", "DEROUIN", "DERBYSHIRE", "DENMON", "DENA", "DEMSKI", "DELUCCA", "DELPINO", "DELMONT"};
		public static String[] divisions = {"Lightweight", "Middleweight", "Welterweight", "Light Heavyweight", "Heavyweight"};
		public static String[] locations = {"New York", "Denver", "London", "Las Vegas", "Los Angeles", "Dublin", "Paris", "Seattle"};

		public static int firstNameLength = firstNames.length;
		public static int lastNameLength = lastNames.length;
		public static int divisionsLength = divisions.length;
		public static int boxerTotal = 7500;
		public static int mainFightId = 1;

		public static ArrayList<Boxer> allBoxers = new ArrayList<Boxer>();
		public static ArrayList<Boxer> lightweightBoxers = new ArrayList<Boxer>();
		public static ArrayList<Boxer> middleweightBoxers = new ArrayList<Boxer>();
		public static ArrayList<Boxer> welterweightBoxers = new ArrayList<Boxer>();
		public static ArrayList<Boxer> lightheavyweightBoxers = new ArrayList<Boxer>();
		public static ArrayList<Boxer> heavyweightBoxers = new ArrayList<Boxer>();
		public static ArrayList<FightResults> theResults = new ArrayList<FightResults>();
		public static ArrayList<Fight> theFights = new ArrayList<Fight>();
		public static ArrayList<FightParticipants> theParticipants = new ArrayList<FightParticipants>();

	public static void main(String[] args) {


		for(int i = 0; i < 7500; i++) {
			Random rand = new Random();

			int tempId = i + 1;
			String tempfName = firstNames[rand.nextInt(firstNameLength)];
			String templName = lastNames[rand.nextInt(lastNameLength)];
			String tempFullName = tempfName + " " + templName;
			String tempDivision = divisions[rand.nextInt(divisionsLength)];
			int tempKO = 0;
			String tempRec = "0-0-0";
			Boolean tempActive = rand.nextBoolean();
			//Create random name from first and last name array, random division, and create boxer

			Boxer tempBoxer = new Boxer(tempId, tempFullName, tempRec, tempKO, tempDivision, tempActive);

			//Add boxer to array list for the boxer's division
			switch(tempBoxer.getDivision()) {
			case "Lightweight":
				lightweightBoxers.add(tempBoxer);
				allBoxers.add(tempBoxer);
				break;
			case "Middleweight":
				middleweightBoxers.add(tempBoxer);
				allBoxers.add(tempBoxer);
				break;
			case "Welterweight":
				welterweightBoxers.add(tempBoxer);
				allBoxers.add(tempBoxer);
				break;
			case "Light Heavyweight":
				lightheavyweightBoxers.add(tempBoxer);
				allBoxers.add(tempBoxer);
				break;
			case "Heavyweight":
				heavyweightBoxers.add(tempBoxer);
				allBoxers.add(tempBoxer);
				break;
			default:
				throw new IllegalArgumentException("Problem in Switch Statement in main");
			}
		}//End of for loop

		//Generate fights for each weight class
		generateFights(lightweightBoxers);
		System.out.println("Fight Id after Lighweight = " + mainFightId);
		System.out.println("Fight Results 1 " + theResults.get(0));
		generateFights(middleweightBoxers);
		generateFights(welterweightBoxers);
		generateFights(lightheavyweightBoxers);
		generateFights(heavyweightBoxers);
		System.out.println("Fight Id after Heavyweight = " + mainFightId);
		System.out.println("Fight Results 37500 " + theResults.get(37499));

		try {
			//Write data into each file
			FileWriter boxerFw = new FileWriter("boxer.txt");
			Writer boxerOutput = new BufferedWriter(boxerFw);
			for(int i = 0; i < allBoxers.size(); i++) {
				boxerOutput.write(allBoxers.get(i).toString() + "\n");

			}
			boxerOutput.close();

			FileWriter fightFw = new FileWriter("fights.txt");
			Writer fightsOutput = new BufferedWriter(fightFw);
			for(int i = 0; i < theFights.size(); i++) {
				fightsOutput.write(theFights.get(i).toString() + "\n");
			}
			fightsOutput.close();

			FileWriter participantsFw = new FileWriter("fightParticipants.txt");
			Writer participantsOutput = new BufferedWriter(participantsFw);
			for(int i = 0; i < theParticipants.size(); i++) {
				participantsOutput.write(theParticipants.get(i).toString() + "\n");
			}
			participantsOutput.close();

			FileWriter resultsFw = new FileWriter("fightResults.txt");
			Writer resultsOutput = new BufferedWriter(resultsFw);
			for(int i = 0; i < theResults.size(); i++) {
				resultsOutput.write(theResults.get(i).toString() + "\n");
			}
			resultsOutput.close();

			//theResults, theParticipants
		} catch(Exception e) {
			System.out.println("Problem with fileWriter");
		}
	}//End of main

	public static void generateFights(ArrayList<Boxer> boxers) {
		//7500 random fights for each division
		for(int i = 0; i < 7500; i++) {

			Random rand = new Random();
			int randIndex = rand.nextInt(boxers.size());

			String tempLocation = locations[rand.nextInt(locations.length)];
			Boolean tempTitle = rand.nextBoolean();
			String tempDivision = boxers.get(0).getDivision();

			Fight tempFight = new Fight(mainFightId, tempLocation, tempDivision, tempTitle);
			theFights.add(tempFight);

			Boxer randBoxer1 = boxers.get(randIndex);
			Boxer randBoxer2 = boxers.get(rand.nextInt(boxers.size()));

			while(randBoxer1 == randBoxer2) {
				randBoxer2 = boxers.get(rand.nextInt(boxers.size()));
			}

			FightParticipants tempParts = new FightParticipants(mainFightId, randBoxer1.getId(), randBoxer2.getId());
			theParticipants.add(tempParts);

			mainFightId++;
			//Generate results
			generateResults(randBoxer1, randBoxer2, tempFight);

		}//End of for loop

	}//End of generateFights

	public static void generateResults(Boxer boxer1, Boxer boxer2, Fight theFight) {

		String tempResult = "And the winner by KO... ";
		Boxer winner;
		Random rand = new Random();
		int randNum = rand.nextInt(10) + 1;
		//Each boxer has 40% chance of winning, 40% chance of losing, and 20% chance of drawing
		switch(randNum) {
		case 1:
			winner = boxer1;
			boxer1.updateWin();
			boxer2.updateLoss();
			break;
		case 2:
			winner = boxer1;
			boxer1.updateWin();
			boxer2.updateLoss();
			break;
		case 3:
			winner = boxer1;
			boxer1.updateWin();
			boxer2.updateLoss();
			break;
		case 4:
			winner = boxer1;
			boxer1.updateWin();
			boxer2.updateLoss();
			break;
		case 5:
			winner = boxer2;
			boxer2.updateWin();
			boxer1.updateLoss();
			break;
		case 6:
			winner = boxer2;
			boxer2.updateWin();
			boxer1.updateLoss();
			break;
		case 7:
			winner = boxer2;
			boxer2.updateWin();
			boxer1.updateLoss();
			break;
		case 8:
			winner = boxer2;
			boxer2.updateWin();
			boxer1.updateLoss();
			break;
		case 9:
			winner = null;
			tempResult = "It's a Draw!!";
			boxer2.updateDraw();
			boxer1.updateDraw();
			break;
		case 10:
			winner = null;
			tempResult = "It's a Draw!!";
			boxer2.updateDraw();
			boxer1.updateDraw();
			break;
		default:
			throw new IllegalArgumentException("Problem in Switch Statement in generateResults");
		}
		if(winner != null) {
			tempResult = tempResult + winner.getName();
		}

		FightResults tempResults = new FightResults(theFight.getId(), tempResult, boxer1.getRecord(), boxer2.getRecord());

		theResults.add(tempResults);

	}//End of generateResults

}//End of generator

class FightResults{
	private int fightId;
	private String fightResult;
	private String fighter1Record;
	private String fighter2Record;

	public FightResults(int fid, String fResult, String f1Rec, String f2Rec) {
		fightId = fid;
		fightResult = fResult;
		fighter1Record = f1Rec;
		fighter2Record = f2Rec;
	}

	public String toString() {
		return fightId + ", " + fightResult + ", " + fighter1Record + ", " + fighter2Record;
	}
}

class FightParticipants{
	private int fightId;
	private int fighter1Id;
	private int fighter2Id;

	public FightParticipants(int fid, int f1id, int f2id) {
		fightId = fid;
		fighter1Id = f1id;
		fighter2Id = f2id;
	}

	public String toString() {
		return fightId + ", " + fighter1Id + ", " + fighter2Id;
	}
}

class Fight {
	private int fightId;
	private String location;
	private String division;
	private Boolean forTitle;

	public Fight(int id, String fLocation, String div, Boolean title) {
		fightId = id;
		location = fLocation;
		division = div;
		forTitle = title;
	}

	public int getId() {
		return fightId;
	}

	public String toString() {
		return fightId + ", " + location + ", " + division + ", " + forTitle;
	}
}

class Boxer {
	private int boxerId;
	private String name;
	private String currentRecord;
	private int koTotal;
	private String division;
	private Boolean isActive;

	public Boxer(int id, String bName, String record, int ko, String div, Boolean active) {
		boxerId = id;
		name = bName;
		currentRecord = record;
		koTotal = ko;
		division = div;
		isActive = active;
	}

	public String getName() {
		return name;
	}

	public String getDivision() {
		return division;
	}

	public int getId() {
		return boxerId;
	}

	public String getRecord() {
		return currentRecord;
	}

	public void updateWin() {
		koTotal += 1;
		String[] recordSplit = currentRecord.split("-");
		int winTot = Integer.parseInt(recordSplit[0]) + 1;
		currentRecord = winTot + "-" + recordSplit[1] + "-" + recordSplit[2];
	}

	public void updateLoss() {
		String[] recordSplit = currentRecord.split("-");
		int lossTot = Integer.parseInt(recordSplit[1]) + 1;
		currentRecord = recordSplit[0] + "-" + lossTot + "-" + recordSplit[2];
	}

	public void updateDraw() {
		String[] recordSplit = currentRecord.split("-");
		int drawTot = Integer.parseInt(recordSplit[2]) + 1;
		currentRecord = recordSplit[0] + "-" + recordSplit[1] + "-" + drawTot;
	}

	public String toString() {
		return boxerId + ", " + name + ", " + currentRecord + ", " + koTotal + ", " + division + ", " + isActive;
	}
}
