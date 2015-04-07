package bootcamp.android.repositories;

import bootcamp.android.models.Product;
import bootcamp.android.services.ContentDownloader;
import bootcamp.android.services.ProductsParser;

import java.util.ArrayList;

public class ProductRepository {

  public ArrayList<Product> getProducts() {
    String strJSONData = new ContentDownloader().fetchResponse("http://xplorationstudio.com/sample_images/products_json.json");
    return new ProductsParser().parseProducts(strJSONData);
  }
}