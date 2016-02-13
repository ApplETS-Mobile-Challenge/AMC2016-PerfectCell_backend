package perfectcell.mock;

import perfectcell.model.Donation;
import perfectcell.repositories.ICrudRepository;

import java.util.ArrayList;

/**
 * Created by jjgha on 2016-02-13.
 */
public class MockDonationRepository {
    private ArrayList<Donation> donationsList;

    public MockDonationRepository() {
        this.donationsList = new ArrayList<>();
        initialize();
    }

    private void initialize() {
        Donation donation1 = new Donation();
        Donation donation2 = new Donation();
        Donation donation3 = new Donation();
        Donation donation4 = new Donation();
        Donation donation5 = new Donation();

        donation1.setDonationMateriel("Équipements de réseautique");
        donation1.setGiverName("Cisco");
        donation1.setReceiverName("Omer");
        donation1.setDonationMonetaire(6000);
        donationsList.add(donation1);

        donation2.setDonationMonetaire(1000);
        donation2.setGiverName("Google");
        donation2.setReceiverName("ApplETS");
        donation2.setDonationMateriel("Premier prix compétition AMC");
        donationsList.add(donation2);

        donation3.setDonationMonetaire(600);
        donation3.setGiverName("Ubisoft");
        donation3.setReceiverName("Conjure");
        donation3.setDonationMateriel("");
        donationsList.add(donation3);

        donation4.setDonationMateriel("Ordinateurs");
        donation4.setGiverName("Hewlett-Packard");
        donation4.setReceiverName("Eclipse");
        donation4.setDonationMonetaire(14000);
        donationsList.add(donation4);

        donation5.setDonationMateriel("GoPro Hero 4");
        donation5.setGiverName("GoPro");
        donation5.setReceiverName("Omer");
        donation5.setDonationMonetaire(2000);
        donationsList.add(donation5);
    }

    public Donation Add(Donation model) {
        donationsList.add(model);
        return model;
    }

    public Donation Edit(Donation model) {
        for (int i = 0; i < donationsList.size(); ++i) {
            if (donationsList.get(i).getGiverName().equals(model.getGiverName()) && donationsList.get(i).getReceiverName().equals(model.getReceiverName()) ) {
                donationsList.remove(i);
                donationsList.add(model);
                return model;
            }
        }
        return null;
    }

    public boolean Delete(String giverName, String receiverName) {
        for (int i = 0; i < donationsList.size(); ++i) {
            if (donationsList.get(i).getGiverName().equals(giverName) && donationsList.get(i).getReceiverName().equals(receiverName)) {
                donationsList.remove(i);
                return true;
            }
        }
        return false;
    }

    public Donation GetDonation(String giverName, String receiverName) {
        for (Donation donation : donationsList) {
            if (donation.getGiverName().equals(giverName) && donation.getReceiverName().equals(receiverName)) {
                return donation;
            }
        }
        return null;
    }

    public ArrayList<Donation> List() {
        return donationsList;
    }
}
