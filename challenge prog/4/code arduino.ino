#include <LiquidCrystal.h>

// initialize the library with the numbers of the interface pins
LiquidCrystal lcd(12, 11, 5, 4, 3, 2);

 
void setup()
{
  Serial.begin(9600);
  pinMode(A0, INPUT);
  pinMode(A1, OUTPUT);
  pinMode(A2, OUTPUT);
  pinMode(A3, OUTPUT);
  // set up the LCD's number of columns and rows:
  lcd.begin(16, 2);
  // Print a message to the LCD.
  lcd.print("hello world!");
}



void loop()
{
  int pot = analogRead(A0)/4;
  Serial.println(pot);
  analogWrite(A1, 0);
  lcd.setCursor(0, 1);
  lcd.print("Roulez       ");
  analogWrite(A3,pot);
  delay(5000);
  analogWrite(A3, 0);
  lcd.setCursor(0, 1);
  lcd.print("Ralentissez");
  analogWrite(A2,pot);
  delay(5000);
  analogWrite(A2, 0);
  lcd.setCursor(0, 1);
  lcd.print("Stop       ");
  analogWrite(A1,pot);
  delay(5000);

}