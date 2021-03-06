import hello.DrinkMachine
import hello.Machine
import spock.lang.Specification

class MachineSpec extends Specification {

    def "Company name displayed on all machines"(){

        given: "A Machine"

        Machine vM = new Machine("Smyrna","GA", "001");

        when: "the machine is accessed"

        String nameTest=vM.displayCompanyName()

        then: " the company name is displayed"

        nameTest.equals("Thank you for using The Evolution Machine!")



    }

    def "Creating a Machine with a Location and ID"(){

        given: "a city, state, and id,"

        String city = "Smyrna";

        String state = "GA";

        String machineId = "001"

        when: "a Machine is created"

        DrinkMachine dM = new DrinkMachine(city, state, machineId);

        then: "it is given a city, state, and ID"

        dM.getMachineId().equals("001");
        dM.getLocation().getCity().equals("Smyrna");
        dM.getLocation().getState().equals("GA");


    }



}