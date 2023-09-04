import java.util.HashMap;
import java.util.Map;

public class ListingRepository {
    private Map<String, ListingModel> listings = new HashMap<>();

    public ListingModel getListingById(String listingId) {
        return listings.get(listingId);
    }

    public void addListing(ListingModel listing) {
        listings.put(listing.getListingId(), listing);
    }
}
