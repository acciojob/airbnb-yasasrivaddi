public class ListingModel {
    private String listingId;
    private String location;

    public ListingModel(String listingId, String location) {
        this.listingId = listingId;
        this.location = location;
    }

    public String getListingId() {
        return listingId;
    }

    public String getLocation() {
        return location;
    }
}
