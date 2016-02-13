package perfectcell.mock;

import perfectcell.model.User;
import perfectcell.repositories.ICrudRepository;

import java.util.ArrayList;

/**
 * Created by jjgha on 2016-02-13.
 */
public class MockUserRepository implements ICrudRepository<User> {
    ArrayList<User> usersList;
    ArrayList<String> needsList;


    public MockUserRepository() {
        needsList = new ArrayList<>();
        usersList = new ArrayList<User>();



        initialize();
    }

    private void initialize() {
        User user1 = new User();
        user1.setDescription(
                "ApplETS est un regroupement d'étudiants qui partagent un intérêt commun pour le domaine des télécommunications et des applications mobiles. Le club a pour objectif principal de former, au sein de l’ÉTS, une main-d’œuvre spécialisée en ingénierie d’applications mobiles et d'en promouvoir le développement au sein de la communauté étudiante.");
        user1.setName("ApplETS");
        user1.setTypeUsager("receiver");
        needsList.add("Matériel informatique");
        needsList.add("Logiciels pour développer");
        needsList.add("Soutien monétaire pour les compétitions");
        user1.setNeeds(needsList);


        User user2 = new User();
        user2.setDescription(
                "Conjure est le club de développement de jeux vidéo de l’École de technologie supérieure de Montréal. Nos membres ont comme projet le développement d’un jeu vidéo de leur choix. Nous utilisons plusieurs outils qui sont aussi utilisés dans l'industrie, tels que Unreal Engine et Unity. Nos membres participent aussi à des Game Jams, des compétitions intensives de développement de jeu vidéo qui se déroulent en général sur une courte période de temps.\n");
        user2.setName("Conjure");
        user2.setTypeUsager("receiver");
        needsList.clear();
        needsList.add("Matériel informatique");
        needsList.add("Logiciels pour développer des jeux vidéos");
        needsList.add("Soutien monétaire pour les compétitions");
        user2.setNeeds(needsList);

        User user3 = new User();
        user3.setDescription(
                "Fonctionnant uniquement avec l’énergie recueillie par ses cellules solaires, Éclipse 7, le tout dernier prototype du club, intègre les plus récentes technologies en matière de conversion et de gestion de l’énergie. Il compte 400 cellules solaires au silicium, une carrosserie aérodynamique et légère en fibre de carbone, et est le résultat des milliers d’heures de travail!");
        user3.setName("Eclipse");
        user3.setTypeUsager("receiver");
        needsList.clear();
        needsList.add("Matériaux pour fabriquer les véhicules");
        needsList.add("Soutien monétaire pour les compétitions");
        user3.setNeeds(needsList);

        User user4 = new User();
        user4.setDescription(
                "Omer est un club étudiant dont la mission est la conception et la fabrication de sous-marins à propulsion humaine. Les étudiants participent à chaque année à des compétitions d’envergure internationale qui réunissent plusieurs équipes dans une épreuve de course. Mis sur pied en 1990, le club est un chef de file dans son domaine, détenant plus d'une douzaine de records de vitesse absolue. Dès 1996, le sous-marin Omer 2 a établi le premier record de vitesse et depuis, les performances du club ont toujours été croissantes. Omer 8 a été couronné champion à la 1re European Submarine Races, tenue en juin 2012 en Angleterre, et Omer 9 est actuellement en gestation.");
        user4.setName("Omer");
        user4.setTypeUsager("receiver");
        needsList.clear();
        needsList.add("Matériaux pour fabriquer les sous-marins");
        needsList.add("Soutien monétaire pour le transport des sous-marins");
        user4.setNeeds(needsList);

        User user5 = new User();
        user5.setDescription(
                "RockÉTS est un club universitaire scientifique ayant pour objectifs de promouvoir les sciences spatiales et de participer à l’Intercollegiate Rocket Engineering Competition, qui se déroule chaque année aux États-Unis dans le Utah. Les membres prennent ainsi part à la conception, la fabrication et au lancement de deux fusées haute puissance. Celles-ci doivent atteindre des altitudes de 10 000 et de 25 000 pieds et transporter une charge utile scientifique de 10 lbs. RockÉTS se démarque depuis sa première participation à la compétition : en 2013, le club a remporté la seconde place et en 2014, un double podium. ");
        user5.setName("RockETS");
        user5.setTypeUsager("receiver");
        needsList.clear();
        needsList.add("Matériaux pour fabriquer les fusées.");
        user5.setNeeds(needsList);

        User user6 = new User();
        user6.setDescription("Cisco Systems est une entreprise informatique américaine spécialisée, à l’origine, dans le matériel réseau (routeur et commutateur ethernet), et depuis 2009 dans les serveurs et les réseaux.");
        user6.setName("Cisco");
        user6.setTypeUsager("giver");

        User user7 = new User();
        user7.setDescription("Google est une filiale de la société Alphabet fondée le 4 septembre 1998 dans le garage Google dans la Silicon Valley, en Californie, par Larry Page et Sergueï Brin, créateurs du moteur de recherche Google. L'entreprise s'est principalement fait connaître à travers la situation monopolistique de son moteur de recherche, concurrencé historiquement par AltaVista puis par Yahoo! et Bing. Elle a ensuite procédé à de nombreuses acquisitions et développements et détient aujourd'hui de nombreux logiciels et sites web notables parmi lesquels YouTube, le système d'exploitation pour téléphones mobiles Android, ainsi que d'autres services tels que Google Earth, Google Maps ou Google Play.");
        user7.setName("Google");
        user7.setTypeUsager("giver");

        User user8 = new User();
        user8.setDescription("Ubisoft est une entreprise française de développement, d'édition et de distribution de jeux vidéo, créée en mars 1986 par les cinq frères Guillemot, originaires de Carentoir en Bretagne.");
        user8.setName("Ubisoft");
        user8.setTypeUsager("giver");

        User user9 = new User();
        user9.setDescription("Hewlett-Packard Company, officiellement abrégée en HP, est une entreprise multinationale américaine initialement d’électronique et d'instrumentation qui a évolué vers l'informatique, les imprimantes, les Serveurs & Réseaux et le multimédia.");
        user9.setName("Hewlett-Packard");
        user9.setTypeUsager("giver");

        User user10 = new User();
        user10.setDescription("GoPro, anciennement Woodman Labs, est une entreprise basée à San Mateo en Californie, qui commercialise des caméras d'action. Son fondateur est Nick Woodman.");
        user10.setName("GoPro");
        user10.setTypeUsager("giver");

        usersList.add(user1);
        usersList.add(user2);
        usersList.add(user3);
        usersList.add(user4);
        usersList.add(user5);
        usersList.add(user6);
        usersList.add(user7);
        usersList.add(user8);
        usersList.add(user9);
        usersList.add(user10);

    }


    @Override
    public User Add(User model) {
        usersList.add(model);
        return model;
    }

    @Override
    public User Edit(User model) {
        for (int i = 0; i < usersList.size(); ++i) {
            if (usersList.get(i).getName().equals(model.getName())) {
                usersList.remove(i);
                usersList.add(model);
                return model;
            }
        }
        return null;
    }

    @Override
    public boolean Delete(String name) {
        for (int i = 0; i < usersList.size(); ++i) {
            if (usersList.get(i).getName().equals(name)) {
                usersList.remove(i);
                return true;
            }
        }
        return false;
    }

    @Override
    public User Get(String name) {
        for (User user : usersList) {
            if (user.getName().equals(name)) {
                return user;
            }
        }
        return null;
    }

    @Override
    public ArrayList<User> List() {
        return usersList;
    }
}