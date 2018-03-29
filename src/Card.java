public class Card {
	
	private String id;
    private String game;
    private String name;
    private String set_name;
    private String set_id;
    private String rarity;
    private String front;
    private String back;
    private String mc;
    private float cmc;
    private String colors;
    private String type;
    private String text;
    private String flavor;
    private String power;
    private String toughness;
    private String loyalty;
    private String revMc;
    private String revColors;
    private String revName;
    private String revType;
    private String revText;
    private String revFlavor;
    private String revPower;
    private String revToughness;
    private String revLoyalty;
    private String artist;
    private String year;
    
    private Automaton automaton;
	
    public Card() {}
    
    public Card(String id, String game, String name, String set_name, String set_id, String rarity, String front, String back, String mc, float cmc, String colors, String type, String text, String flavor, String power, String toughness, String loyalty, String revMc, String revColors, String revName, String revType, String revText, String revFlavor, String revPower, String revToughness, String revLoyalty, String artist, String year) {
        this.id = id;
        this.game = game;
        this.name = name;
        this.set_name = set_name;
        this.set_id = set_id;
        this.rarity = rarity;
        this.front = front;
        this.back = back;
        this.mc = mc;
        this.cmc = cmc;
        this.colors = colors;
        this.type = type;
        this.text = text;
        this.flavor = flavor;
        this.power = power;
        this.toughness = toughness;
        this.loyalty = loyalty;
        this.revMc = revMc;
        this.revColors = revColors;
        this.revName = revName;
        this.revType = revType;
        this.revText = revText;
        this.revFlavor = revFlavor;
        this.revPower = revPower;
        this.revToughness = revToughness;
        this.revLoyalty = revLoyalty;
        this.artist = artist;
        this.year = year;
    }
    
    
}
