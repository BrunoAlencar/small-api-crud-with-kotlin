package com.joaobrunoalencar.crudapi

import org.springframework.data.jpa.repository.JpaRepository

interface AccountRepository: JpaRepository<Account, Long> {

}