String text = "";
String url = null;
 
// Added missing code that was in a tab
XML xml;
boolean testNull = false;
 
public void setup() 
  {
  size(200, 200);     
  }
 
public void draw() 
  {
  url = "http://" + "www.yr.no/place/Ecuador/Galapagos/Seymour/forecast.xml";
  loadxml();
  noLoop();
  }
 
void mousePressed() 
  {
  loop();
  }
 
void loadxml()
  {
  try
    {
    xml = loadXML(url);
    }
  catch (NullPointerException nullPointer)
    {
    testNull = true;
    }   
 
    println(testNull);
 
  if (testNull == false)
    {  
  // Load the XML document
    xml = loadXML(url);  
 
    XML credit = xml.getChild("credit/link");
    println(credit.getString("text"));
    text = credit.getString("text");
    println(credit.getString("url"));
    url = credit.getString("url");  
    }
  else
    {
    text = ("Unavailable"); 
    url = ("Unavailable");
    println(text);
    println(url);
    }  
  }  
 
  
