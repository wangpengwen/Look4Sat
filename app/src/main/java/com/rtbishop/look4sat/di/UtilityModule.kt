/*
 * Look4Sat. Amateur radio and weather satellite tracker and passes predictor for Android.
 * Copyright (C) 2019, 2020 Arty Bishop (bishop.arty@gmail.com)
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */

package com.rtbishop.look4sat.di

import android.content.Context
import android.content.SharedPreferences
import android.location.LocationManager
import com.rtbishop.look4sat.utility.DataManager
import com.rtbishop.look4sat.utility.PrefsManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UtilityModule {

    @Singleton
    @Provides
    fun providePrefsManager(preferences: SharedPreferences): PrefsManager {
        return PrefsManager(preferences)
    }

    @Singleton
    @Provides
    fun provideDataManager(locationManager: LocationManager, context: Context): DataManager {
        return DataManager(locationManager, context)
    }
}
