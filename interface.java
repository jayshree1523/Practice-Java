// public class Player implements iSaveable {
// // write code here
// private String name;
// private String weapon;
// private int hitPoints;
// private int strength;
// public Player(String name, int hitPoints, int strength){
// this.name = name;
// this.hitPoints = hitPoints;
// this.strength = strength;
// this.weapon = "Sword";
// }
// public void setName(String name) {
// this.name = name;
// }
// public String getName() {
// return name;
// }

// public void setHitPoints(int hintPoints) {
// this.hintPoints = hintPoints;
// }
// public String getHintPoints() {
// return hintPoints;
// }

// public void setStrength(int Strength) {
// this.strength = strength;
// }
// public String getStrength() {
// return strength;
// }

// public void setWeapon(String weapon) {
// this.weapon = weapon;
// }
// public String getWeapon() {
// return weapon;
// }

// @Override
// public String toString(){
// return "player{" +"name='"+ name + '\''+ ", hitPoints="+ hitPoints +",
// strength="+ strength +", weapon='"+ weapon + '\''+ "}";
// }

// @Override
// public List<String> write() {
// List<String> values = new ArrayList<>();
// values.add(0, this.name);
// values.add(1, "" +this.hitPoints);
// values.add(2, "" +this.strength);
// values.add(3, "" +this.weapon);

// return values;
// }

// @Override
// public void read(List<String> savedValues){
// if(savedValues != null && savedValues.size()>0) {
// this.name = savedValues.get(0);
// this.hitPoints = Integer.ParseINT(savedValues.get(1));
// this.strength = Integer.ParseINT(savedValues.get(2));
// this.weapon = savedValues.get(3);

// }
// }

// }public class Player implements iSaveable {
// // write code here
// private String name;
// private String weapon;
// private int hitPoints;
// private int strength;
// public Player(String name, int hitPoints, int strength){
// this.name = name;
// this.hitPoints = hitPoints;
// this.strength = strength;
// this.weapon = "Sword";
// }
// public void setName(String name) {
// this.name = name;
// }
// public String getName() {
// return name;
// }

// public void setHitPoints(int hintPoints) {
// this.hintPoints = hintPoints;
// }
// public String getHintPoints() {
// return hintPoints;
// }

// public void setStrength(int Strength) {
// this.strength = strength;
// }
// public String getStrength() {
// return strength;
// }

// public void setWeapon(String weapon) {
// this.weapon = weapon;
// }
// public String getWeapon() {
// return weapon;
// }

// @Override
// public String toString(){
// return "player{" +"name='"+ name + '\''+ ", hitPoints="+ hitPoints +",
// strength="+ strength +", weapon='"+ weapon + '\''+ "}";
// }

// @Override
// public List<String> write() {
// List<String> values = new ArrayList<>();
// values.add(0, this.name);
// values.add(1, "" +this.hitPoints);
// values.add(2, "" +this.strength);
// values.add(3, "" +this.weapon);

// return values;
// }

// @Override
// public void read(List<String> savedValues){
// if(savedValues != null && savedValues.size()>0) {
// this.name = savedValues.get(0);
// this.hitPoints = Integer.ParseINT(savedValues.get(1));
// this.strength = Integer.ParseINT(savedValues.get(2));
// this.weapon = savedValues.get(3);

// }
// }

// }