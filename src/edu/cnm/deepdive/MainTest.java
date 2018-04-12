package edu.cnm.deepdive;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {

  @Test
  public void main() {
    Assert.assertEquals(Main.complement("ATATGCGC"), "TATACGCG");
    Assert.assertEquals(Main.complement("GCCTTTAAAATTTCCG"), "CGGAAATTTTAAAGGC");
    Assert.assertEquals(Main.complement("ATCGATCG"), "TAGCTAGC");
    Assert.assertEquals(Main.complement("CCCCGGGTTA"), "GGGGCCCAAT");
  }


}