package com.adityakamble49.mcrypt.cache.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import android.arch.persistence.room.TypeConverters
import com.adityakamble49.mcrypt.model.RSAKeyPair

/**
 * MCryptDatabase
 *
 * @author Aditya Kamble
 * @since 10/12/2017
 */
@Database(entities = [(RSAKeyPair::class)], version = 1)
@TypeConverters(MCryptTypeConverters::class)
abstract class MCryptDatabase : RoomDatabase() {

    abstract fun rsaKeyPairDao(): RSAKeyPairDao
}