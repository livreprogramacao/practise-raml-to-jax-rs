/*
 * Copyright 2013-2017 (c) MuleSoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific
 * language governing permissions and limitations under the License.
 */
package server.humanity;

import br.emp.minhacomunidade.api.model.ArmImpl;
import br.emp.minhacomunidade.api.model.CorpseImpl;
import br.emp.minhacomunidade.api.model.Gender;
import br.emp.minhacomunidade.api.model.Human;
import br.emp.minhacomunidade.api.model.HumanId;
import br.emp.minhacomunidade.api.model.Limb;
import br.emp.minhacomunidade.api.model.PersonImpl;
import br.emp.minhacomunidade.api.types.Complexhumans;
import br.emp.minhacomunidade.api.types.Complexhumans.GetComplexhumansByIdResponse;
import br.emp.minhacomunidade.api.types.Complexhumans.GetComplexhumansResponse;
import java.util.Collections;
import java.util.Date;

/**
 * @author JP
 */
public class ComplexHumanityImpl implements Complexhumans {

    @Override
    public GetComplexhumansByIdResponse getComplexhumansById(HumanId id) {

        if ("person".equals(id.getType())) {

            PersonImpl pi = new PersonImpl();
            pi.setActualGender(Gender.FEMALE);
            pi.setWeight(180);

            pi.setDateOfBirth(new Date());
            pi.setInstantOfBirth(new Date());
            pi.setTimeOfArrival(new Date());
            pi.setDateOfBirth(new Date());
            pi.setTimeOfBirth(new Date());
            pi.setRequestTime(new Date());

            CorpseImpl ci = new CorpseImpl();
            ci.setDateOfDeath(new Date());
            pi.setSiblings(Collections.<Human>singletonList(ci));
            pi.setLimbs(new Limb(new ArmImpl()));
            return GetComplexhumansByIdResponse.respond200WithApplicationJson(pi);
        } else {

            CorpseImpl ci = new CorpseImpl();
            ci.setActualGender(Gender.OTHER);
            ci.setDateOfDeath(new Date());
            return GetComplexhumansByIdResponse.respond200WithApplicationJson(ci);
        }
    }

    @Override
    public GetComplexhumansResponse getComplexhumans(HumanId id) {

        if ("person".equals(id.getType())) {

            PersonImpl pi = new PersonImpl();
            pi.setActualGender(Gender.FEMALE);
            pi.setWeight(180);

            pi.setDateOfBirth(new Date());
            pi.setInstantOfBirth(new Date());
            pi.setTimeOfArrival(new Date());
            pi.setDateOfBirth(new Date());
            pi.setTimeOfBirth(new Date());
            pi.setRequestTime(new Date());

            CorpseImpl ci = new CorpseImpl();
            ci.setDateOfDeath(new Date());
            pi.setSiblings(Collections.<Human>singletonList(ci));
            pi.setLimbs(new Limb(new ArmImpl()));
            return GetComplexhumansResponse.respond200WithApplicationJson(pi);
        } else {

            CorpseImpl ci = new CorpseImpl();
            ci.setActualGender(Gender.OTHER);
            ci.setDateOfDeath(new Date());
            return GetComplexhumansResponse.respond200WithApplicationJson(ci);
        }
    }
}
