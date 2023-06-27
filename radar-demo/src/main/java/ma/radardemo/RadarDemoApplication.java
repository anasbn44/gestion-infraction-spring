package ma.radardemo;

import lombok.AllArgsConstructor;
import ma.radardemo.entities.Infraction;
import ma.radardemo.entities.Radar;
import ma.radardemo.entities.Vehicule;
import ma.radardemo.services.RadarGrpcService;
import ma.radardemo.services.RestTempServices;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;
import java.util.stream.Collectors;

@SpringBootApplication @AllArgsConstructor
public class RadarDemoApplication implements CommandLineRunner {
    private RestTempServices restTempServices;
    private RadarGrpcService radarGrpcService;
    public static void main(String[] args) {
        SpringApplication.run(RadarDemoApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        //get all radars
        List<Radar> radars = radarGrpcService.getAllRadars();
        //get matricules of vehicules
        List<String> matricules =
                radarGrpcService.getAllVehicules().stream().map(vehicule -> vehicule.getMatricule()).collect(Collectors.toList());

        //creating random indexes
        Random random=new Random();
        int indexRadar = random.nextInt(radars.size());
        int indexMatricules = random.nextInt(matricules.size());
        //getting random radar and matricule
        Radar randomRadar = radars.get(indexRadar);
        String randomMatricule = matricules.get(indexMatricules);
        //getting radom vehicule speed
        double vitesseVehicle =
                random.nextDouble(randomRadar.getVitesseMax(),randomRadar.getVitesseMax() + random.nextInt(1,100));
        //generating new infraction
        Infraction infraction = radarGrpcService.generateInfraction(randomMatricule, vitesseVehicle, randomRadar);

        System.out.println(infraction);

        TimerTask task=new TimerTask() {
            @Override
            public void run() {
                //get all radars
                List<Radar> radars = radarGrpcService.getAllRadars();
                //get matricules of vehicules
                List<String> matricules =
                        radarGrpcService.getAllVehicules().stream().map(vehicule -> vehicule.getMatricule()).collect(Collectors.toList());

                //creating random indexes
                Random random=new Random();
                int indexRadar = random.nextInt(radars.size());
                int indexMatricules = random.nextInt(matricules.size());
                //getting random radar and matricule
                Radar randomRadar = radars.get(indexRadar);
                String randomMatricule = matricules.get(indexMatricules);
                //getting radom vehicule speed
                double vitesseVehicle =
                        random.nextDouble(randomRadar.getVitesseMax(),randomRadar.getVitesseMax() + random.nextInt(1,100));
                //generating new infraction
                Infraction infraction = radarGrpcService.generateInfraction(randomMatricule, vitesseVehicle, randomRadar);

                System.out.println(infraction);

            }
        };

        Timer timer=new Timer("ticTac");
        timer.scheduleAtFixedRate(task,0,20000L);

    }
}
