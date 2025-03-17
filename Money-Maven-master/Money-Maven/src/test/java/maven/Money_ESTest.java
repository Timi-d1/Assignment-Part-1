/*
 * This file was automatically generated by EvoSuite
 * Mon Mar 17 01:14:49 GMT 2025
 */

package maven;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import maven.Money;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Money_ESTest extends Money_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Money money0 = new Money((-807), "fmaven|.one ");
      Money money1 = money0.add(money0);
      boolean boolean0 = money0.equals(money1);
      assertFalse(money1.equals((Object)money0));
      assertEquals((-1614), money1.getAmount());
      assertEquals((-807), money0.getAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Money money0 = new Money(0, (String) null);
      money0.getCurrency();
      assertEquals(0, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Money money0 = new Money((-179), "&:*Z~+2vH?X'>");
      money0.getCurrency();
      assertEquals((-179), money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Money money0 = new Money(2026, "");
      int int0 = money0.getAmount();
      assertEquals(2026, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Money money0 = new Money((-2233), "@+a9|MuOam\"5X|");
      int int0 = money0.getAmount();
      assertEquals((-2233), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Money money0 = new Money(0, "");
      Money money1 = money0.add(money0);
      assertEquals(0, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Money money0 = new Money(4910, "");
      Money money1 = money0.add(money0);
      assertEquals(4910, money0.getAmount());
      assertEquals(9820, money1.getAmount());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Money money0 = new Money(0, "");
      Money money1 = new Money(0, (String) null);
      // Undeclared exception!
      try { 
        money0.equals(money1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Money money0 = new Money(0, "");
      // Undeclared exception!
      try { 
        money0.add((Money) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("maven.Money", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Money money0 = new Money(0, "");
      money0.getCurrency();
      assertEquals(0, money0.getAmount());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Money money0 = new Money(0, "");
      int int0 = money0.getAmount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Money money0 = new Money(701, "H");
      Money money1 = new Money(701, "G");
      boolean boolean0 = money1.equals(money0);
      assertEquals(701, money1.getAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Money money0 = new Money(0, "");
      boolean boolean0 = money0.equals("");
      assertEquals(0, money0.getAmount());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Money money0 = new Money((-60), "]+n");
      boolean boolean0 = money0.equals(money0);
      assertEquals((-60), money0.getAmount());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Money money0 = new Money((-60), "]+n");
      Money money1 = money0.add(money0);
      boolean boolean0 = money1.equals(money0);
      assertFalse(boolean0);
      assertEquals((-60), money0.getAmount());
      assertEquals((-120), money1.getAmount());
      assertFalse(money0.equals((Object)money1));
  }
}
