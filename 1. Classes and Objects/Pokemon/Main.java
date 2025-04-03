class Main{
	public static void main(String[] args){
		
		Pokemon p1 = new Pokemon();

		for(int i = 0; i < p1.name.length; i++){
			System.out.println("Pokemon : \nName: " + p1.name[i] + " \nLevel: "  + p1.lvl[i] + "\nID: " + p1.id[i] + "\n");
		}		
	}
}