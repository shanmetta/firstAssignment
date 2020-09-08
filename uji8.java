import java.util.*;
public class uji8{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);

		ArrayList<String> type = new ArrayList<String>();
		ArrayList<String> name = new ArrayList<String>();
		ArrayList<Double> calories = new ArrayList<Double>();
		ArrayList<Integer> price = new ArrayList<Integer>();



		String tipe;
		String nama = "";
		double kalori = 0;
		int harga = 0;
		int choose = 0;
		int delete;
		int index = 0;



		do{
			for(int i=0; i<30;){
				System.out.println();
				i++;
				}

				System.out.println("Food Order");
				System.out.println("==========");
				System.out.println("1. Insert new food");
				System.out.println("2. List of food");
				System.out.println("3. Search Food");
				System.out.println("4. Delete Food");
				System.out.println("5. Exit");
				System.out.print("Choose: ");
				choose = scan.nextInt(); scan.nextLine();

			for(int i=0; i<30;){
				System.out.println();
				i++;
				}



			switch (choose){
				case 1 :
						for(int i=0; i>30;){
							System.out.println();
							i++;
							}

						do{
							System.out.print("Input food's type[Appetizer|Main Course|Dessert]: ");
							tipe = scan.nextLine();
						}while(!tipe.equalsIgnoreCase("Appetizer")&&!tipe.equalsIgnoreCase("Main Course")&&!tipe.equalsIgnoreCase("Dessert"));

							type.add(tipe);

						do{
							System.out.print("Input food's name[3-20]: ");
							nama = scan.nextLine();
						}while(nama.length()<3||nama.length()>20);

							name.add(nama);

						do{
							System.out.print("Input food's calories[1.0...4.0]: ");
							kalori = scan.nextDouble(); scan.nextLine();
						}while(kalori<1.0||kalori>4.0);

							calories.add(kalori);

							do{
								System.out.print("Input food's price[10000...50000]: ");
								harga = scan.nextInt(); scan.nextLine();
							}while(harga<10000||harga>50000);

								price.add(harga);

							System.out.print("Data has been successfully inserted!");
							scan.nextLine();
							break;

				case 2:
						if(type.isEmpty()){
							System.out.print("No Data!");
							}else if(type.size()>0){

						for(int i=0;i<type.size();i++){
							System.out.println("No: " +(i+1));
							System.out.println("====");
							System.out.println("1. Type: " + type.get(i));
							System.out.println("2. Name: " + name.get(i));
							System.out.println("3. Calories: " + calories.get(i));
							System.out.println("4. Price: "+ price.get(i));
							System.out.print("");
							}
							}
							scan.nextLine();
							break;

				case 3 :

						do{
						System.out.print("Input food's name [3-20] : ");
						nama = scan.nextLine();
						index = name.indexOf(nama);
						}while(nama.length()< 3 || nama.length()>20);


						for(int i = 0; i <name.size(); i++){
							System.out.println("");
						}
								if(name.get(index).equalsIgnoreCase(nama)){
								System.out.println("No: " +(index+1));
								System.out.println("====");
								System.out.println("1. Type: " + type.get(index));
								System.out.println("2. Name: " + name.get(index));
								System.out.println("3. Calories: " + calories.get(index));
								System.out.println("4. Price: "+ price.get(index));
								System.out.print("");
								scan.nextLine();
								}else if(!name.equals(nama)){
									System.out.println("No Data Found!");
									scan.nextLine();
								}

								break;
					case 4 :

							if(name.isEmpty()){
								System.out.print("No Data!");
							}else{
								for(int i=0;i<type.size();i++){
								System.out.println("No: " +(i+1));
								System.out.println("====");
								System.out.println("1. Type: " + type.get(i));
								System.out.println("2. Name: " + name.get(i));
								System.out.println("3. Calories: " + calories.get(i));
								System.out.println("4. Price: "+ price.get(i));
								System.out.print("");
									}

									do{
										System.out.println("Input number<no> to be deleted[1..2][0 for cancel]: ");
										delete = scan.nextInt(); scan.nextLine();
									}while(delete>name.size());

									if(delete == 0){
										System.out.println("canceled");
									}else{
											type.remove(delete-1);
											name.remove(delete-1);
											calories.remove(delete-1);
											price.remove(delete-1);
											System.out.println("Data has been successfully deleted!");
											scan.nextLine();

									}


						}
								System.out.print("");
								scan.nextLine();
								break;
}


		}while(choose!=5);


	}

	}