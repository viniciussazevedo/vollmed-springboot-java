package med.voll.api.patient;

import med.voll.api.address.AddressData;

public record PatientRecordData(String name, String email, String telephone, String cpf, AddressData address) {
}
