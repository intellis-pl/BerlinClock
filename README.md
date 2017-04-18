# BerlinClock

The Berlin Clock

The Berlin Uhr (Clock) is an interesting way to show the time. On the top of the clock there is a yellow lamp that
blinks on/off every two seconds. The time is calculated by adding rectangular lamps.
 
The top two rows of lamps are red. These indicate the hours of a day. In the top row there are 4 red lamps. Every lamp
represents 5 hours. In the lower row of red lamps every lamp represents 1 hour. So if two lamps of the first row and
three of the second row are switched on that indicates 5+5+3=13h or 1 pm.
 
The two rows of lamps at the bottom count the minutes. The first of these rows has 11 lamps, the second 4. In the
first row every lamp represents 5 minutes. In this first row the 3rd, 6th and 9th lamp are red and indicate the first
quarter, half and last quarter of an hour. The other lamps are yellow. In the last row with 4 lamps every lamp
represents 1 minute.

Exemplary scenarios presented below.


Scenario: Midnight
When the time is 00:00:00
Then the clock should look like


Y

OOOO

OOOO

OOOOOOOOOOO

OOOO


Scenario: Middle of the afternoon
When the time is 13:17:01
Then the clock should look like

O

RROO

RRRO

YYROOOOOOOO

YYOO


Scenario: Just before midnight
When the time is 23:59:59
Then the clock should look like


O

RRRR

RRRO

YYRYYRYYRYY

YYYY


Scenario: Midnight
When the time is 24:00:00
Then the clock should look like


Y

RRRR

RRRR

OOOOOOOOOOO

OOOO
