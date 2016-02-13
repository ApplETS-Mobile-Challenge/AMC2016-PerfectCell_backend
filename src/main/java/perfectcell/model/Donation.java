package perfectcell.model;

import org.codehaus.jackson.map.annotate.JsonCachable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@JsonCachable
public class Donation {

    private String donationMateriel;
    private int donationMonetaire;
    private String receiverName;
    private String giverName;

    public int getDonationMonetaire() {
        return donationMonetaire;
    }

    public void setDonationMonetaire(int donationMonetaire) {
        this.donationMonetaire = donationMonetaire;
    }

    public void setDonationMateriel(String donationMateriel) {
        this.donationMateriel = donationMateriel;
    }

    public String getReceiverName() {
        return receiverName;
    }

    public void setReceiverName(String receiverName) {
        this.receiverName = receiverName;
    }

    public String getGiverName() {
        return giverName;
    }

    public void setGiverName(String giverName) {
        this.giverName = giverName;
    }
}
