package com.clangengineer.exformmaker.security

import com.clangengineer.exformmaker.config.SYSTEM_ACCOUNT
import org.springframework.data.domain.AuditorAware
import org.springframework.stereotype.Component
import java.util.*

/**
 * Implementation of [AuditorAware] based on Spring Security.
 */
@Component
class SpringSecurityAuditorAware : AuditorAware<String> {
    override fun getCurrentAuditor(): Optional<String> = Optional.of(getCurrentUserLogin().orElse(SYSTEM_ACCOUNT))
}
