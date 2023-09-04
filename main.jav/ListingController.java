public class ListingController {
    private ListingService listingService;

    public ListingController(ListingService listingService) {
        this.listingService = listingService;
    }

    public ListingModel getListing(String listingId) {
        return listingService.getListingById(listingId);
    }

    public void createListing(ListingModel listing) {
        listingService.addListing(listing);
    }
}
