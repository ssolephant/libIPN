/*
 * Inventory Profiles Next
 *
 *   Copyright (c) 2022 Plamen K. Kosseff <p.kosseff@gmail.com>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

@file:Suppress("unused")


package org.anti_ad.mc.common

import org.anti_ad.mc.common.gui.widgets.widgetsInitGlue
import org.anti_ad.mc.common.vanilla.alias.aliasInitGlue
import org.anti_ad.mc.common.vanilla.render.renderInitTheGlue
import org.anti_ad.mc.common.vanilla.vanillaInitGlue

private var initGlueProc: (() -> Unit) = ::initGlues
private fun nop() {}

private fun initGlues() {
    renderInitTheGlue()
    aliasInitGlue()
    vanillaInitGlue()
    widgetsInitGlue()
    initGlueProc = ::nop
}

@Suppress("unused")
fun init() {
    initGlueProc()
}
