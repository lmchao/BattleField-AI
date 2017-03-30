/*
 * Copyright (c) 2012-2017, Ing. Gabriel Barrera <gmbarrera@gmail.com>
 * 
 * Permission to use, copy, modify, and/or distribute this software for any
 * purpose with or without fee is hereby granted, provided that the above 
 * copyright notice and this permission notice appear in all copies.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS" AND THE AUTHOR DISCLAIMS ALL WARRANTIES 
 * WITH REGARD TO THIS SOFTWARE INCLUDING ALL IMPLIED WARRANTIES OF 
 * MERCHANTABILITY AND FITNESS. IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR 
 * ANY SPECIAL, DIRECT, INDIRECT, OR CONSEQUENTIAL DAMAGES OR ANY DAMAGES 
 * WHATSOEVER RESULTING FROM LOSS OF USE, DATA OR PROFITS, WHETHER IN AN 
 * ACTION OF CONTRACT, NEGLIGENCE OR OTHER TORTIOUS ACTION, ARISING OUT OF 
 * OR IN CONNECTION WITH THE USE OR PERFORMANCE OF THIS SOFTWARE.
 */

package ia.battle.core.abilities;

import java.util.List;
import java.util.stream.Collectors;

import ia.battle.core.Warrior;

public abstract class Ability {

	public static StealthAbility getStealthAbility(Warrior enemyWarrior) {
		
		List<Ability> ab = enemyWarrior.getAbilities().stream().filter(u -> u instanceof StealthAbility).collect(Collectors.toList());
		if (ab.size() > 0)
			return (StealthAbility)ab.get(0);
		
		return null;
	}
	
	
	
}
