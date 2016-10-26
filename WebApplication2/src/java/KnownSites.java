
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wl2-lam
 */
public class KnownSites {

  private ArrayList<String> al = new ArrayList<String>();
  private String[] urls = {"google.com", "sighb.org", "well.com", "fish.net"};

  public KnownSites() {
    for (String url : urls) {
      al.add(url);
    }
  }

  public boolean isKnown(String url) {
    return al.contains(url);
  }
}

