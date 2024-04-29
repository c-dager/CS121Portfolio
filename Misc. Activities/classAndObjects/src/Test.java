public class Test {
    public static void main(String[] args) {
        Pet myPet = new Pet();
        Team myTeam = new Team();

        myPet.setName("Carl");
        myPet.setType("Dog");
        myPet.setAge(7);

        System.out.println(myPet.getName() + " " + myPet.getType() +" " + myPet.getAge());

        myTeam.setCityAndMascotAndSport("Indy", "Colts", "Football");
        System.out.println(myTeam.getCity() +" " + myTeam.getMascot() + " " +myTeam.getSport());

    }

}
