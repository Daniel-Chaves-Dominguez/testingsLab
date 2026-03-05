# Middle-Earth Battle - Java Project


![battle of The Lord of the Rings](https://res.cloudinary.com/duzljw2pp/image/upload/v1772716148/batalla-se%C3%B1or-de-los-anillos_liknhh.jpg)
## Description
This project simulates a battle in Middle-Earth between the forces of good and evil.  
Each race has a strength value between 1 and 5, and the total army strength is calculated by multiplying the number of members of each race by their respective strength value.

The program then determines the winner based on the total strength of each army, or declares a tie if both forces are equally strong.

---

## Races and Strength Values

**Good Races:**
- Hobbits: 1
- Good Men: 2
- Dwarves: 3
- Numenoreans: 4
- Elves: 5

**Evil Races:**
- Evil Men: 2
- Orcs: 2
- Goblins: 2
- Wargs: 3
- Trolls: 5

---

## How to Use

1. Run the `MiddleEarthBattle.java` file.
2. Enter the number of members for each race for both armies.
3. The program will display:
    - Total strength of the good army
    - Total strength of the evil army
    - Battle result (Good wins, Evil wins, or Tie)

---

## Tests

The project includes a comprehensive test suite using **JUnit 5**:

- `assertEquals` to verify exact outcomes
- `assertNotEquals` to verify inequality
- `assertTrue` / `assertFalse` for logical conditions
- `assertThrows` to demonstrate exception handling

All tests are in the file `MiddleEarthBattleTest.java`.

---

## Example Battles

| Good Army | Evil Army | Result |
|-----------|-----------|--------|
| 1 Hobbit | 1 Orc | Evil wins |
| 2 Hobbits | 1 Orc | Tie |
| 3 Hobbits | 1 Orc | Good wins |

---
