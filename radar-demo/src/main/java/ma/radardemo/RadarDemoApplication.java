package ma.radardemo;

import lombok.AllArgsConstructor;
import ma.radardemo.entities.Infraction;
import ma.radardemo.entities.Radar;
import ma.radardemo.entities.Vehicule;
import ma.radardemo.services.RestTempServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

@SpringBootApplication @AllArgsConstructor
public class RadarDemoApplication implements CommandLineRunner {
    private RestTempServices restTempServices;
    public static void main(String[] args) {
        SpringApplication.run(RadarDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        //getAllRadars
        Radar[] allRadars = restTempServices.getAllRadars();
        //getAllVehicles
        Vehicule[] allVehicles = restTempServices.getAllVehicles();
        //createRandomIndex
        Random random=new Random();
        //randomIndexes
        int indxRadar = random.nextInt(allRadars.length);
        int indxVehicle = random.nextInt(allVehicles.length);
        //SelecteIndexesVariable
        Radar selectedRadar=allRadars[indxRadar];
        Vehicule selectedVehicle=allVehicles[indxVehicle];
        //RandomSpeeedOfVehicle
        double vehicleSpeed=random.nextDouble(selectedRadar.getVitesseMax(),selectedRadar.getVitesseMax()+random.nextInt(1,100));
        //sendNewInfraction
        Infraction newInfracInfo = Infraction.builder().numeroRadar(selectedRadar.getId()).matriculeVehicule(selectedVehicle.getMatricule()).vitesseVehicule(vehicleSpeed).build();
        boolean results = restTempServices.senInfraction(newInfracInfo);
        System.out.println(results);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                //getAllRadars
                Radar[] allRadars = restTempServices.getAllRadars();
                //getAllVehicles
                Vehicule[] allVehicles = restTempServices.getAllVehicles();
                //createRandomIndex
                Random random=new Random();
                //randomIndexes
                int indxRadar = random.nextInt(allRadars.length);
                int indxVehicle = random.nextInt(allVehicles.length);
                //SelecteIndexesVariable
                Radar selectedRadar=allRadars[indxRadar];
                Vehicule selectedVehicle=allVehicles[indxVehicle];
                //RandomSpeeedOfVehicle
                double vehicleSpeed=random.nextDouble(selectedRadar.getVitesseMax(),selectedRadar.getVitesseMax()+random.nextInt(1,100));
                //sendNewInfraction
                Infraction newInfracInfo = Infraction.builder().numeroRadar(selectedRadar.getId()).matriculeVehicule(selectedVehicle.getMatricule()).vitesseVehicule(vehicleSpeed).build();
                boolean results = restTempServices.senInfraction(newInfracInfo);
                System.out.println(results);

            }
        };

        Timer timer=new Timer("ticTac");
        timer.scheduleAtFixedRate(task,0,20000L);

    }
}
