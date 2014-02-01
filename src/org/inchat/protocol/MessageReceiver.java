/*
 * Copyright (C) 2013, 2014 inchat.org
 * 
 * This file is part of inchat-common.
 * 
 * inchat-common is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * inchat-common is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.inchat.protocol;

import org.inchat.common.Message;

/**
 *
 */
public interface MessageReceiver {
    /**
     * Handle incomming Messages
     * @param msg 
     */
    public void onMessage(Message msg);
}
